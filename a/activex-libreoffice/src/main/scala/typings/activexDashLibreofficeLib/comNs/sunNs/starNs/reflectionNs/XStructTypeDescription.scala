package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a struct type, supporting polymorphic struct types.
  *
  * This type supersedes {@link XCompoundTypeDescription} , which only supports plain struct types.
  *
  * This type is used to reflect all of the following:
  *
  * Polymorphic struct type templates, like `Struct<T, U>` . For these, {@link com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} returns
  * a non-empty sequence, while {@link com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} returns an empty sequence.
  *
  * Instantiated polymorphic struct types, like `Struct<long, hyper>` . For these, {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} returns an empty sequence, while {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} returns a non-empty sequence.
  *
  * Plain struct types. For these, both {@link com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} and {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} return an empty sequence.
  * @since OOo 2.0
  */
trait XStructTypeDescription extends XCompoundTypeDescription {
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  val TypeArguments: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  val TypeParameters: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  def getTypeArguments(): activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  def getTypeParameters(): activexDashInteropLib.SafeArray[java.lang.String]
}

