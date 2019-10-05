package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXSLProcessor Interface */
@JSGlobal("MSXML2.IXSLProcessor")
@js.native
class IXSLProcessor protected () extends js.Object {
  var `MSXML2.IXSLProcessor_typekey`: IXSLProcessor = js.native
  /** XML input tree to transform */
  var input: js.Any = js.native
  /** custom stream object for transform output */
  var output: js.Any = js.native
  /** template object used to create this processor object */
  val ownerTemplate: XSLTemplate60 = js.native
  /** current state of the processor */
  val readyState: Double = js.native
  /** starting XSL mode */
  val startMode: String = js.native
  /** namespace of starting XSL mode */
  val startModeURI: String = js.native
  /** current stylesheet being used */
  val stylesheet: IXMLDOMNode = js.native
  /** pass object to stylesheet */
  def addObject(obj: js.Any, namespaceURI: String): Unit = js.native
  /**
    * set <xsl:param> values
    * @param namespaceURI [namespaceURI='0']
    */
  def addParameter(baseName: String, parameter: js.Any): Unit = js.native
  def addParameter(baseName: String, parameter: js.Any, namespaceURI: String): Unit = js.native
  /** reset state of processor and abort current transform */
  def reset(): Unit = js.native
  /**
    * set XSL mode and it's namespace
    * @param namespaceURI [namespaceURI='0']
    */
  def setStartMode(mode: String): Unit = js.native
  def setStartMode(mode: String, namespaceURI: String): Unit = js.native
  /** start/resume the XSL transformation process */
  def transform(): Boolean = js.native
}

