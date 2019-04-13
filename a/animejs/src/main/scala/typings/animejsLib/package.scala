package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animejsLib {
  type AnimeCallbackFunction = js.Function1[/* anim */ animejsLib.animejsMod.AnimeInstance, scala.Unit]
  // Allowing null is necessary because DOM queries may not return anything.
  type AnimeTarget = java.lang.String | js.Object | stdLib.HTMLElement | stdLib.SVGElement | stdLib.NodeList | scala.Null
  type FunctionBasedParameter = js.Function3[
    /* element */ stdLib.HTMLElement, 
    /* index */ scala.Double, 
    /* length */ scala.Double, 
    scala.Double
  ]
}
