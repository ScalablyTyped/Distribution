package typings
package activexDashMsxml2Lib.MSXML2Ns

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
  val readyState: scala.Double = js.native
  /** starting XSL mode */
  val startMode: java.lang.String = js.native
  /** namespace of starting XSL mode */
  val startModeURI: java.lang.String = js.native
  /** current stylesheet being used */
  val stylesheet: IXMLDOMNode = js.native
  /** pass object to stylesheet */
  def addObject(obj: js.Any, namespaceURI: java.lang.String): scala.Unit = js.native
  /**
           * set <xsl:param> values
           * @param namespaceURI [namespaceURI='0']
           */
  def addParameter(baseName: java.lang.String, parameter: js.Any): scala.Unit = js.native
  /**
           * set <xsl:param> values
           * @param namespaceURI [namespaceURI='0']
           */
  def addParameter(baseName: java.lang.String, parameter: js.Any, namespaceURI: java.lang.String): scala.Unit = js.native
  /** reset state of processor and abort current transform */
  def reset(): scala.Unit = js.native
  /**
           * set XSL mode and it's namespace
           * @param namespaceURI [namespaceURI='0']
           */
  def setStartMode(mode: java.lang.String): scala.Unit = js.native
  /**
           * set XSL mode and it's namespace
           * @param namespaceURI [namespaceURI='0']
           */
  def setStartMode(mode: java.lang.String, namespaceURI: java.lang.String): scala.Unit = js.native
  /** start/resume the XSL transformation process */
  def transform(): scala.Boolean = js.native
}

