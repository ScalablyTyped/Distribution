package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object motionMod {
  type MotionEndFunc = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* event */ typings.std.TransitionEvent, 
    scala.Boolean
  ]
  type MotionFunc = js.Function1[/* element */ typings.std.HTMLElement, typings.react.mod.CSSProperties]
}
