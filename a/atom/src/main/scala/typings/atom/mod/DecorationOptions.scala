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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationOptions
  extends StObject
     with SharedDecorationOptions {
  
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[String] = js.undefined
  
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | overlay | gutter | block | cursor_] = js.undefined
}
object DecorationOptions {
  
  inline def apply(): DecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationOptions]
  }
  
  extension [Self <: DecorationOptions](x: Self) {
    
    inline def setGutterName(value: String): Self = StObject.set(x, "gutterName", value.asInstanceOf[js.Any])
    
    inline def setGutterNameUndefined: Self = StObject.set(x, "gutterName", js.undefined)
    
    inline def setType(value: line | `line-number` | text | highlight | overlay | gutter | block | cursor_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
