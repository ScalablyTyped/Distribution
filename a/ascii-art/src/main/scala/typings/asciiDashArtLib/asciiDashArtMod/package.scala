package typings
package asciiDashArtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asciiDashArtMod {
  type ArtworkType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
  type Cb = js.Function1[/* result */ java.lang.String, scala.Unit]
  type FontType = js.Function4[
    /* text */ java.lang.String, 
    /* font */ js.UndefOr[java.lang.String], 
    /* styleOrCallback */ js.UndefOr[java.lang.String | Cb], 
    /* callback */ js.UndefOr[Cb], 
    Art
  ]
  type ImageType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
  type JoinType = js.Function1[/* repeated */ js.Any, Art]
  type LinesType = js.Function1[/* repeated */ js.Any, Art]
  type OverlayType = js.Function1[/* repeated */ js.Any, Art]
  type StringsType = js.Function1[/* repeated */ js.Any, Art]
  type StyleType = js.Function3[
    /* text */ java.lang.String, 
    /* style */ js.UndefOr[java.lang.String], 
    /* close */ js.UndefOr[scala.Boolean], 
    Art
  ]
  type TableType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
}
