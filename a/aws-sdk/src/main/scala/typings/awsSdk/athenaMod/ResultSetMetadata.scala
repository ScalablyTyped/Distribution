package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetMetadata extends StObject {
  
  /**
    * Information about the columns returned in a query result metadata.
    */
  var ColumnInfo: js.UndefOr[ColumnInfoList] = js.native
}
object ResultSetMetadata {
  
  @scala.inline
  def apply(): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetMetadata]
  }
  
  @scala.inline
  implicit class ResultSetMetadataMutableBuilder[Self <: ResultSetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnInfo(value: ColumnInfoList): Self = StObject.set(x, "ColumnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnInfoUndefined: Self = StObject.set(x, "ColumnInfo", js.undefined)
    
    @scala.inline
    def setColumnInfoVarargs(value: ColumnInfo*): Self = StObject.set(x, "ColumnInfo", js.Array(value :_*))
  }
}
