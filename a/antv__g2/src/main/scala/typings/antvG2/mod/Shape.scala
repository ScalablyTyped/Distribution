package typings.antvG2.mod

import org.scalablytyped.runtime.TopLevel
import typings.antvG2.anon.Draw
import typings.antvG2.anon.DrawShape
import typings.antvG2.anon.ParsePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var getLinearValue: js.UndefOr[js.Function1[/* percent */ js.Any, _]] = js.undefined
  var registerShape: js.UndefOr[
    js.Function3[
      /* chartType */ String, 
      /* shapeName */ String, 
      /* config */ Draw | DrawShape, 
      ParsePath
    ]
  ] = js.undefined
}

@JSImport("@antv/g2", "Shape")
@js.native
object Shape extends TopLevel[Shape]

