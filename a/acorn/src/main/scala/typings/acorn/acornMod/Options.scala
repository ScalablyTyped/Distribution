package typings.acorn.acornMod

import typings.acorn.acornNumbers.`2015`
import typings.acorn.acornNumbers.`2016`
import typings.acorn.acornNumbers.`2017`
import typings.acorn.acornNumbers.`3`
import typings.acorn.acornNumbers.`5`
import typings.acorn.acornNumbers.`6`
import typings.acorn.acornNumbers.`7`
import typings.acorn.acornNumbers.`8`
import typings.acorn.acornStrings.module
import typings.acorn.acornStrings.script
import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHashBang: js.UndefOr[Boolean] = js.undefined
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
  var allowReserved: js.UndefOr[Boolean] = js.undefined
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
  var directSourceFile: js.UndefOr[String] = js.undefined
  var ecmaVersion: js.UndefOr[`3` | `5` | `6` | `7` | `8` | `2015` | `2016` | `2017`] = js.undefined
  var locations: js.UndefOr[Boolean] = js.undefined
  var onComment: js.UndefOr[
    (js.Function6[
      /* isBlock */ Boolean, 
      /* text */ String, 
      /* start */ Double, 
      /* end */ Double, 
      /* startLoc */ js.UndefOr[typings.estree.estreeMod.Position], 
      /* endLoc */ js.UndefOr[typings.estree.estreeMod.Position], 
      Unit
    ]) | js.Array[Comment]
  ] = js.undefined
  var onInsertedSemicolon: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ Double, 
      /* lastTokEndLoc */ js.UndefOr[typings.estree.estreeMod.Position], 
      Unit
    ]
  ] = js.undefined
  var onToken: js.UndefOr[(js.Function1[/* token */ Token, _]) | js.Array[Token]] = js.undefined
  var onTrailingComma: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ Double, 
      /* lastTokEndLoc */ js.UndefOr[typings.estree.estreeMod.Position], 
      Unit
    ]
  ] = js.undefined
  var plugins: js.UndefOr[PlainObject] = js.undefined
  var preserveParens: js.UndefOr[Boolean] = js.undefined
  var program: js.UndefOr[Program] = js.undefined
  var ranges: js.UndefOr[Boolean] = js.undefined
  var sourceFile: js.UndefOr[String] = js.undefined
  var sourceType: js.UndefOr[script | module] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHashBang: js.UndefOr[Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined,
    allowReserved: js.UndefOr[Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    directSourceFile: String = null,
    ecmaVersion: `3` | `5` | `6` | `7` | `8` | `2015` | `2016` | `2017` = null,
    locations: js.UndefOr[Boolean] = js.undefined,
    onComment: (js.Function6[
      /* isBlock */ Boolean, 
      /* text */ String, 
      /* start */ Double, 
      /* end */ Double, 
      /* startLoc */ js.UndefOr[typings.estree.estreeMod.Position], 
      /* endLoc */ js.UndefOr[typings.estree.estreeMod.Position], 
      Unit
    ]) | js.Array[Comment] = null,
    onInsertedSemicolon: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[typings.estree.estreeMod.Position]) => Unit = null,
    onToken: (js.Function1[/* token */ Token, _]) | js.Array[Token] = null,
    onTrailingComma: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[typings.estree.estreeMod.Position]) => Unit = null,
    plugins: PlainObject = null,
    preserveParens: js.UndefOr[Boolean] = js.undefined,
    program: Program = null,
    ranges: js.UndefOr[Boolean] = js.undefined,
    sourceFile: String = null,
    sourceType: script | module = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHashBang)) __obj.updateDynamic("allowHashBang")(allowHashBang.asInstanceOf[js.Any])
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReserved)) __obj.updateDynamic("allowReserved")(allowReserved.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction.asInstanceOf[js.Any])
    if (directSourceFile != null) __obj.updateDynamic("directSourceFile")(directSourceFile.asInstanceOf[js.Any])
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (onComment != null) __obj.updateDynamic("onComment")(onComment.asInstanceOf[js.Any])
    if (onInsertedSemicolon != null) __obj.updateDynamic("onInsertedSemicolon")(js.Any.fromFunction2(onInsertedSemicolon))
    if (onToken != null) __obj.updateDynamic("onToken")(onToken.asInstanceOf[js.Any])
    if (onTrailingComma != null) __obj.updateDynamic("onTrailingComma")(js.Any.fromFunction2(onTrailingComma))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveParens)) __obj.updateDynamic("preserveParens")(preserveParens.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

