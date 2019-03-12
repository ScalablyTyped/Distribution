package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A common interface for substituting string variables with other strings.
  *
  * The substitution algorithm and the syntax for a string variable are not part of this interface definition. Please look at the documentation of the
  * implementation that must specify these parameters.
  * @since OOo 1.1.2
  */
trait XStringSubstitution
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the current value of a variable.
    *
    * The method iterates through it's internal variable list and tries to find the given variable. If the variable is unknown a {@link
    * com.sun.star.container.NoSuchElementException} is thrown.
    * @param variable The name of a variable.
    * @returns Returns a string that represents the variable. If the variable is unknown a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def getSubstituteVariableValue(variable: java.lang.String): java.lang.String
  /**
    * Tries to replace parts of aText with variables that represents these sub strings.
    *
    * The method iterates through it's internal variable list and tries to match parts of the given string Tries to replace parts of **aText** with
    * variables that represents these sub strings.If more than one variable matches the one with the longest matching sub string will be chosen.
    * @param aText A string where known substrings should be replaced by variables.
    * @returns Returns the resubstituted string with variables for all parts that could be replaced. The unchanged argument will be returned if nothing can be r
    */
  def reSubstituteVariables(aText: java.lang.String): java.lang.String
  /**
    * Exchanges variables inside a given text with a substitution text defined for the variables.
    *
    * The method iterates through it's internal variables list to match the variables in the given string. A match replaces the variable with the string
    * defined for this variable. If no variable can be found in the string it will be returned unchanged. The behavior if a variable is found in the string
    * but it is unknown for the implementation depends on the parameter bSubstRequired.
    * @param aText A string containing variables that should be substituted.
    * @param bSubstRequired Specifies if a successful substitution is required. The function throws a {@link com.sun.star.container.NoSuchElementException} if
    * @returns Returns a string based on **aText** where all variables were exchanged with their value defined at calling time.
    */
  def substituteVariables(aText: java.lang.String, bSubstRequired: scala.Boolean): java.lang.String
}

object XStringSubstitution {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getSubstituteVariableValue: java.lang.String => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    reSubstituteVariables: java.lang.String => java.lang.String,
    release: () => scala.Unit,
    substituteVariables: (java.lang.String, scala.Boolean) => java.lang.String
  ): XStringSubstitution = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSubstituteVariableValue = js.Any.fromFunction1(getSubstituteVariableValue), queryInterface = js.Any.fromFunction1(queryInterface), reSubstituteVariables = js.Any.fromFunction1(reSubstituteVariables), release = js.Any.fromFunction0(release), substituteVariables = js.Any.fromFunction2(substituteVariables))
  
    __obj.asInstanceOf[XStringSubstitution]
  }
}

