package typings.acorn.mod

import typings.acorn.acornNumbers.`10`
import typings.acorn.acornNumbers.`11`
import typings.acorn.acornNumbers.`2015`
import typings.acorn.acornNumbers.`2016`
import typings.acorn.acornNumbers.`2017`
import typings.acorn.acornNumbers.`2018`
import typings.acorn.acornNumbers.`2019`
import typings.acorn.acornNumbers.`2020`
import typings.acorn.acornNumbers.`3`
import typings.acorn.acornNumbers.`5`
import typings.acorn.acornNumbers.`6`
import typings.acorn.acornNumbers.`7`
import typings.acorn.acornNumbers.`8`
import typings.acorn.acornNumbers.`9`
import typings.acorn.acornStrings.module
import typings.acorn.acornStrings.never
import typings.acorn.acornStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.native
  
  var allowHashBang: js.UndefOr[Boolean] = js.native
  
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  
  var allowReserved: js.UndefOr[Boolean | never] = js.native
  
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  
  var directSourceFile: js.UndefOr[String] = js.native
  
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
  ] = js.native
  
  var locations: js.UndefOr[Boolean] = js.native
  
  var onComment: js.UndefOr[
    (js.Function6[
      /* isBlock */ Boolean, 
      /* text */ String, 
      /* start */ Double, 
      /* end */ Double, 
      /* startLoc */ js.UndefOr[Position], 
      /* endLoc */ js.UndefOr[Position], 
      Unit
    ]) | js.Array[Comment]
  ] = js.native
  
  var onInsertedSemicolon: js.UndefOr[
    js.Function2[/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position], Unit]
  ] = js.native
  
  var onToken: js.UndefOr[(js.Function1[/* token */ Token, _]) | js.Array[Token]] = js.native
  
  var onTrailingComma: js.UndefOr[
    js.Function2[/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position], Unit]
  ] = js.native
  
  var preserveParens: js.UndefOr[Boolean] = js.native
  
  var program: js.UndefOr[Node] = js.native
  
  var ranges: js.UndefOr[Boolean] = js.native
  
  var sourceFile: js.UndefOr[String] = js.native
  
  var sourceType: js.UndefOr[script | module] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAwaitOutsideFunction(value: Boolean): Self = this.set("allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAwaitOutsideFunction: Self = this.set("allowAwaitOutsideFunction", js.undefined)
    
    @scala.inline
    def setAllowHashBang(value: Boolean): Self = this.set("allowHashBang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHashBang: Self = this.set("allowHashBang", js.undefined)
    
    @scala.inline
    def setAllowImportExportEverywhere(value: Boolean): Self = this.set("allowImportExportEverywhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowImportExportEverywhere: Self = this.set("allowImportExportEverywhere", js.undefined)
    
    @scala.inline
    def setAllowReserved(value: Boolean | never): Self = this.set("allowReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReserved: Self = this.set("allowReserved", js.undefined)
    
    @scala.inline
    def setAllowReturnOutsideFunction(value: Boolean): Self = this.set("allowReturnOutsideFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReturnOutsideFunction: Self = this.set("allowReturnOutsideFunction", js.undefined)
    
    @scala.inline
    def setDirectSourceFile(value: String): Self = this.set("directSourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectSourceFile: Self = this.set("directSourceFile", js.undefined)
    
    @scala.inline
    def setEcmaVersion(
      value: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
    ): Self = this.set("ecmaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcmaVersion: Self = this.set("ecmaVersion", js.undefined)
    
    @scala.inline
    def setLocations(value: Boolean): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setOnCommentVarargs(value: Comment*): Self = this.set("onComment", js.Array(value :_*))
    
    @scala.inline
    def setOnCommentFunction6(
      value: (/* isBlock */ Boolean, /* text */ String, /* start */ Double, /* end */ Double, /* startLoc */ js.UndefOr[Position], /* endLoc */ js.UndefOr[Position]) => Unit
    ): Self = this.set("onComment", js.Any.fromFunction6(value))
    
    @scala.inline
    def setOnComment(
      value: (js.Function6[
          /* isBlock */ Boolean, 
          /* text */ String, 
          /* start */ Double, 
          /* end */ Double, 
          /* startLoc */ js.UndefOr[Position], 
          /* endLoc */ js.UndefOr[Position], 
          Unit
        ]) | js.Array[Comment]
    ): Self = this.set("onComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnComment: Self = this.set("onComment", js.undefined)
    
    @scala.inline
    def setOnInsertedSemicolon(value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position]) => Unit): Self = this.set("onInsertedSemicolon", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInsertedSemicolon: Self = this.set("onInsertedSemicolon", js.undefined)
    
    @scala.inline
    def setOnTokenVarargs(value: Token*): Self = this.set("onToken", js.Array(value :_*))
    
    @scala.inline
    def setOnTokenFunction1(value: /* token */ Token => _): Self = this.set("onToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnToken(value: (js.Function1[/* token */ Token, _]) | js.Array[Token]): Self = this.set("onToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnToken: Self = this.set("onToken", js.undefined)
    
    @scala.inline
    def setOnTrailingComma(value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[Position]) => Unit): Self = this.set("onTrailingComma", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTrailingComma: Self = this.set("onTrailingComma", js.undefined)
    
    @scala.inline
    def setPreserveParens(value: Boolean): Self = this.set("preserveParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveParens: Self = this.set("preserveParens", js.undefined)
    
    @scala.inline
    def setProgram(value: Node): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setRanges(value: Boolean): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setSourceFile(value: String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFile: Self = this.set("sourceFile", js.undefined)
    
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}
