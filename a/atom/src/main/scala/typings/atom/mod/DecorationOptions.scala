package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.block
import typings.atom.atomStrings.cursor_
import typings.atom.atomStrings.gutter
import typings.atom.atomStrings.highlight
import typings.atom.atomStrings.line
import typings.atom.atomStrings.overlay
import typings.atom.atomStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorationOptions extends SharedDecorationOptions {
  
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[String] = js.native
  
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | overlay | gutter | block | cursor_] = js.native
}
object DecorationOptions {
  
  @scala.inline
  def apply(): DecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationOptions]
  }
  
  @scala.inline
  implicit class DecorationOptionsMutableBuilder[Self <: DecorationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGutterName(value: String): Self = StObject.set(x, "gutterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterNameUndefined: Self = StObject.set(x, "gutterName", js.undefined)
    
    @scala.inline
    def setType(value: line | `line-number` | text | highlight | overlay | gutter | block | cursor_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
