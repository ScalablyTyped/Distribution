package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text and formatting of a fixed hyperlink field. */
trait XFixedHyperlink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the alignment of the text in the control. */
  var Alignment: scala.Double
  /** returns the text of the control. */
  var Text: java.lang.String
  /** returns the url of the control. */
  var URL: java.lang.String
  /** registers an event handler for click action event. */
  def addActionListener(l: XActionListener): scala.Unit
  /** returns the alignment of the text in the control. */
  def getAlignment(): scala.Double
  /** returns the text of the control. */
  def getText(): java.lang.String
  /** returns the url of the control. */
  def getURL(): java.lang.String
  /** unregisters an event handler for click action event. */
  def removeActionListener(l: XActionListener): scala.Unit
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: scala.Double): scala.Unit
  /** sets the text of the control. */
  def setText(Text: java.lang.String): scala.Unit
  /** sets the url of the control. */
  def setURL(URL: java.lang.String): scala.Unit
}

object XFixedHyperlink {
  @scala.inline
  def apply(
    Alignment: scala.Double,
    Text: java.lang.String,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addActionListener: js.Function1[XActionListener, scala.Unit],
    getAlignment: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    getURL: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActionListener: js.Function1[XActionListener, scala.Unit],
    setAlignment: js.Function1[scala.Double, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit],
    setURL: js.Function1[java.lang.String, scala.Unit]
  ): XFixedHyperlink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alignment")(Alignment)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addActionListener")(addActionListener)
    __obj.updateDynamic("getAlignment")(getAlignment)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeActionListener")(removeActionListener)
    __obj.updateDynamic("setAlignment")(setAlignment)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setURL")(setURL)
    __obj.asInstanceOf[XFixedHyperlink]
  }
}

