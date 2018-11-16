package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var allowHashBang: js.UndefOr[scala.Boolean] = js.undefined
  var allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined
  var allowReserved: js.UndefOr[scala.Boolean] = js.undefined
  var allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined
  var directSourceFile: js.UndefOr[java.lang.String] = js.undefined
  var ecmaVersion: js.UndefOr[
    acornLib.acornLibNumbers.`3` | acornLib.acornLibNumbers.`5` | acornLib.acornLibNumbers.`6` | acornLib.acornLibNumbers.`7` | acornLib.acornLibNumbers.`8` | acornLib.acornLibNumbers.`2015` | acornLib.acornLibNumbers.`2016` | acornLib.acornLibNumbers.`2017`
  ] = js.undefined
  var locations: js.UndefOr[scala.Boolean] = js.undefined
  var onComment: js.UndefOr[
    (js.Function6[
      /* isBlock */ scala.Boolean, 
      /* text */ java.lang.String, 
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* startLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      /* endLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]) | js.Array[Comment]
  ] = js.undefined
  var onInsertedSemicolon: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ scala.Double, 
      /* lastTokEndLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]
  ] = js.undefined
  var onToken: js.UndefOr[(js.Function1[/* token */ Token, _]) | js.Array[Token]] = js.undefined
  var onTrailingComma: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ scala.Double, 
      /* lastTokEndLoc */ js.UndefOr[estreeLib.estreeMod.Position], 
      scala.Unit
    ]
  ] = js.undefined
  var plugins: js.UndefOr[PlainObject] = js.undefined
  var preserveParens: js.UndefOr[scala.Boolean] = js.undefined
  var program: js.UndefOr[estreeLib.estreeMod.Program] = js.undefined
  var ranges: js.UndefOr[scala.Boolean] = js.undefined
  var sourceFile: js.UndefOr[java.lang.String] = js.undefined
  var sourceType: js.UndefOr[acornLib.acornLibStrings.script | acornLib.acornLibStrings.module] = js.undefined
}

