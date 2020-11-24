package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceScanOptions extends js.Object {
  
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.native
  
  /** A function to be periodically called with the number of paths searched. */
  var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ Double, Unit]] = js.native
  
  /** An array of glob patterns to search within. */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.native
}
object WorkspaceScanOptions {
  
  @scala.inline
  def apply(): WorkspaceScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceScanOptions]
  }
  
  @scala.inline
  implicit class WorkspaceScanOptionsOps[Self <: WorkspaceScanOptions] (val x: Self) extends AnyVal {
    
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
    def setLeadingContextLineCount(value: Double): Self = this.set("leadingContextLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingContextLineCount: Self = this.set("leadingContextLineCount", js.undefined)
    
    @scala.inline
    def setOnPathsSearched(value: /* pathsSearched */ Double => Unit): Self = this.set("onPathsSearched", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPathsSearched: Self = this.set("onPathsSearched", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setTrailingContextLineCount(value: Double): Self = this.set("trailingContextLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingContextLineCount: Self = this.set("trailingContextLineCount", js.undefined)
  }
}
