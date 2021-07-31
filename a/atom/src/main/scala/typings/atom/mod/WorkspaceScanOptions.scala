package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceScanOptions extends StObject {
  
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.undefined
  
  /** A function to be periodically called with the number of paths searched. */
  var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ Double, Unit]] = js.undefined
  
  /** An array of glob patterns to search within. */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.undefined
}
object WorkspaceScanOptions {
  
  @scala.inline
  def apply(): WorkspaceScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceScanOptions]
  }
  
  @scala.inline
  implicit class WorkspaceScanOptionsMutableBuilder[Self <: WorkspaceScanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeadingContextLineCount(value: Double): Self = StObject.set(x, "leadingContextLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingContextLineCountUndefined: Self = StObject.set(x, "leadingContextLineCount", js.undefined)
    
    @scala.inline
    def setOnPathsSearched(value: /* pathsSearched */ Double => Unit): Self = StObject.set(x, "onPathsSearched", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPathsSearchedUndefined: Self = StObject.set(x, "onPathsSearched", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setTrailingContextLineCount(value: Double): Self = StObject.set(x, "trailingContextLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingContextLineCountUndefined: Self = StObject.set(x, "trailingContextLineCount", js.undefined)
  }
}
