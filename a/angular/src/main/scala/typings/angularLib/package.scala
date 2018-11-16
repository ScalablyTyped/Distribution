package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularLib {
  type JQueryStatic = js.Function1[
    /* element */ java.lang.String | stdLib.Element | stdLib.Document | JQuery | stdLib.ArrayLike[stdLib.Element] | js.Function0[scala.Unit], 
    JQLite
  ]
  /**
   * The interface used to specify the properties parameter in css()
   */
  // tslint:disable-next-line:class-name
  type cssPropertySetter = js.Function2[
    /* index */ scala.Double, 
    /* value */ js.UndefOr[java.lang.String], 
    java.lang.String | scala.Double
  ]
}
