package typings.asciiDashArt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asciiDashArtMod {
  type ArtworkType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
  type Cb = js.Function1[/* result */ String, Unit]
  type FontType = js.Function4[
    /* text */ String, 
    /* font */ js.UndefOr[String], 
    /* styleOrCallback */ js.UndefOr[String | Cb], 
    /* callback */ js.UndefOr[Cb], 
    Art
  ]
  type ImageType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
  type JoinType = js.Function1[/* repeated */ js.Any, Art]
  type LinesType = js.Function1[/* repeated */ js.Any, Art]
  type OverlayType = js.Function1[/* repeated */ js.Any, Art]
  type StringsType = js.Function1[/* repeated */ js.Any, Art]
  type StyleType = js.Function3[
    /* text */ String, 
    /* style */ js.UndefOr[String], 
    /* close */ js.UndefOr[Boolean], 
    Art
  ]
  type TableType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
}
