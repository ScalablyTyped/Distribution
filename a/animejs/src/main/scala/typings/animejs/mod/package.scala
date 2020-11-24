package typings.animejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimeCallbackFunction = js.Function1[/* anim */ typings.animejs.mod.AnimeInstance, scala.Unit]
  
  // Allowing null is necessary because DOM queries may not return anything.
  type AnimeTarget = java.lang.String | js.Object | typings.std.HTMLElement | typings.std.SVGElement | typings.std.NodeList | scala.Null
  
  type CustomEasingFunction = js.Function3[
    /* el */ typings.std.HTMLElement, 
    /* index */ scala.Double, 
    /* length */ scala.Double, 
    js.Function1[/* time */ scala.Double, scala.Double]
  ]
  
  type FunctionBasedParameter = js.Function3[
    /* element */ typings.std.HTMLElement, 
    /* index */ scala.Double, 
    /* length */ scala.Double, 
    scala.Double
  ]
}
