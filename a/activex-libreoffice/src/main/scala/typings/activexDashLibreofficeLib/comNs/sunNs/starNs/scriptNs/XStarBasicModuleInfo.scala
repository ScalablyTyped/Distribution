package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Script Module containing some scripting code in a certain scripting language
  * @deprecated Deprecated
  */
trait XStarBasicModuleInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  val Language: java.lang.String
  /** returns the name of the module */
  val Name: java.lang.String
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  val Source: java.lang.String
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  def getLanguage(): java.lang.String
  /** returns the name of the module */
  def getName(): java.lang.String
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  def getSource(): java.lang.String
}

object XStarBasicModuleInfo {
  @scala.inline
  def apply(
    Language: java.lang.String,
    Name: java.lang.String,
    Source: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getLanguage: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getSource: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStarBasicModuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Language")(Language)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLanguage")(getLanguage)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getSource")(getSource)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStarBasicModuleInfo]
  }
}

