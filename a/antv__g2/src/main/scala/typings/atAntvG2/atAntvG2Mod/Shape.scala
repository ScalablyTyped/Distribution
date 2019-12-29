package typings.atAntvG2.atAntvG2Mod

import org.scalablytyped.runtime.TopLevel
import typings.atAntvG2.Anon_Draw
import typings.atAntvG2.Anon_DrawShape
import typings.atAntvG2.Anon_ParsePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var getLinearValue: js.UndefOr[js.Function1[/* percent */ js.Any, _]] = js.undefined
  var registerShape: js.UndefOr[
    js.Function3[
      /* chartType */ String, 
      /* shapeName */ String, 
      /* config */ Anon_Draw | Anon_DrawShape, 
      Anon_ParsePath
    ]
  ] = js.undefined
}

@JSImport("@antv/g2", "Shape")
@js.native
object Shape extends TopLevel[Shape]

