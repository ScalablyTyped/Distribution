package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Script Module containing some scripting code in a certain scripting language
  * @deprecated Deprecated
  */
trait XStarBasicModuleInfo extends XInterface {
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  val Language: String
  /** returns the name of the module */
  val Name: String
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  val Source: String
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  def getLanguage(): String
  /** returns the name of the module */
  def getName(): String
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  def getSource(): String
}

object XStarBasicModuleInfo {
  @scala.inline
  def apply(
    Language: String,
    Name: String,
    Source: String,
    acquire: () => Unit,
    getLanguage: () => String,
    getName: () => String,
    getSource: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStarBasicModuleInfo = {
    val __obj = js.Dynamic.literal(Language = Language, Name = Name, Source = Source, acquire = js.Any.fromFunction0(acquire), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStarBasicModuleInfo]
  }
}

