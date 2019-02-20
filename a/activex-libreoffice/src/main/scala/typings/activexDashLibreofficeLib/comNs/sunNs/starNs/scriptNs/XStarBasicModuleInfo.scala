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

