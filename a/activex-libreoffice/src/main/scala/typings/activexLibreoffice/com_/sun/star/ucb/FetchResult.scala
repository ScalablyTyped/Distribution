package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains data of several rows of a {@link ContentResultSet} .
  *
  * This struct is returned from {@link XFetchProvider.fetch()} , for example.
  */
@js.native
trait FetchResult extends js.Object {
  
  /**
    * indicates whether and which error has occurred, while fetching.
    *
    * The value may contain zero or more constants of the {@link FetchError} constants group.
    */
  var FetchError: Double = js.native
  
  /**
    * indicates the orientation in which the rows are fetched and set into the sequence {@link FetchResult.Rows} .
    *
    * When {@link FetchResult.Orientation} equals `TRUE` , the rows in {@link FetchResult.Rows} are ordered in the same way as in the original result set.
    */
  var Orientation: Boolean = js.native
  
  /**
    * contains the demanded data.
    *
    * One any contains the data of one whole row. Those methods which use this struct have to specify, what the any has to contain.
    */
  var Rows: SafeArray[_] = js.native
  
  /**
    * indicates the index of the first row contained in {@link FetchResult.Rows} in the original result set. So if {@link FetchResult.StartIndex} equals `3`
    * , the first element in the sequence {@link FetchResult.Rows} contains the data of the index `3` in the original result set.
    *
    * The following rows are one after the other, but the direction depends on the value of FetchResult::Direction
    */
  var StartIndex: Double = js.native
}
object FetchResult {
  
  @scala.inline
  def apply(FetchError: Double, Orientation: Boolean, Rows: SafeArray[_], StartIndex: Double): FetchResult = {
    val __obj = js.Dynamic.literal(FetchError = FetchError.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], StartIndex = StartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResult]
  }
  
  @scala.inline
  implicit class FetchResultOps[Self <: FetchResult] (val x: Self) extends AnyVal {
    
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
    def setFetchError(value: Double): Self = this.set("FetchError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Boolean): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: SafeArray[_]): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("StartIndex", value.asInstanceOf[js.Any])
  }
}
