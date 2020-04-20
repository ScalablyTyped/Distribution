package typings.amcharts.exportSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  var config: js.Any
  var enabled: Boolean
  var libs: js.Object
  var menu: js.Object
  def capture(config: js.Any, callback: js.Function0[Unit]): js.Any
  def toArray(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toBlob(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toCSV(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toCanvas(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toImage(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toJPG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toJSON(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toPDF(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toPNG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toSVG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toXLSX(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
}

object ExportSettings {
  @scala.inline
  def apply(
    capture: (js.Any, js.Function0[Unit]) => js.Any,
    config: js.Any,
    enabled: Boolean,
    libs: js.Object,
    menu: js.Object,
    toArray: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toBlob: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toCSV: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toCanvas: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toImage: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toJPG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toJSON: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toPDF: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toPNG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toSVG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any,
    toXLSX: (js.Any, js.Function1[/* data */ js.Any, Unit]) => js.Any
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(capture = js.Any.fromFunction2(capture), config = config.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], libs = libs.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], toArray = js.Any.fromFunction2(toArray), toBlob = js.Any.fromFunction2(toBlob), toCSV = js.Any.fromFunction2(toCSV), toCanvas = js.Any.fromFunction2(toCanvas), toImage = js.Any.fromFunction2(toImage), toJPG = js.Any.fromFunction2(toJPG), toJSON = js.Any.fromFunction2(toJSON), toPDF = js.Any.fromFunction2(toPDF), toPNG = js.Any.fromFunction2(toPNG), toSVG = js.Any.fromFunction2(toSVG), toXLSX = js.Any.fromFunction2(toXLSX))
    __obj.asInstanceOf[ExportSettings]
  }
}

