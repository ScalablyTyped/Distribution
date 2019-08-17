package typings.animejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animejsMod {
  import typings.std.HTMLElement
  import typings.std.NodeList
  import typings.std.SVGElement

  type AnimeCallbackFunction = js.Function1[/* anim */ AnimeInstance, Unit]
  // Allowing null is necessary because DOM queries may not return anything.
  type AnimeTarget = String | js.Object | HTMLElement | SVGElement | NodeList | Null
  type CustomEasingFunction = js.Function3[
    /* el */ HTMLElement, 
    /* index */ Double, 
    /* length */ Double, 
    js.Function1[/* time */ Double, Double]
  ]
  type FunctionBasedParameter = js.Function3[/* element */ HTMLElement, /* index */ Double, /* length */ Double, Double]
}
