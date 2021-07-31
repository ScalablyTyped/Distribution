package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePath extends StObject {
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var replacements: Double
}
object FilePath {
  
  @scala.inline
  def apply(replacements: Double): FilePath = {
    val __obj = js.Dynamic.literal(replacements = replacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  
  @scala.inline
  implicit class FilePathMutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setReplacements(value: Double): Self = StObject.set(x, "replacements", value.asInstanceOf[js.Any])
  }
}
