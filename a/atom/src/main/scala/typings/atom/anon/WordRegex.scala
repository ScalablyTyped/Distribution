package typings.atom.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordRegex extends StObject {
  
  var wordRegex: js.UndefOr[RegExp] = js.native
}
object WordRegex {
  
  @scala.inline
  def apply(): WordRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordRegex]
  }
  
  @scala.inline
  implicit class WordRegexMutableBuilder[Self <: WordRegex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWordRegex(value: RegExp): Self = StObject.set(x, "wordRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordRegexUndefined: Self = StObject.set(x, "wordRegex", js.undefined)
  }
}
