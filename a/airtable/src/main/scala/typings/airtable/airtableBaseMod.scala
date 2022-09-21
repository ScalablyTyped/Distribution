package typings.airtable

import typings.airtable.baseMod.BaseRequestOptions
import typings.airtable.baseMod.BaseResponse
import typings.airtable.fieldSetMod.FieldSet
import typings.airtable.tableMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object airtableBaseMod {
  
  @js.native
  trait AirtableBase extends StObject {
    
    def apply[TFields /* <: FieldSet */](tableName: String): ^[TFields] = js.native
    
    def getId(): String = js.native
    @JSName("getId")
    var getId_Original: js.Function0[String] = js.native
    
    def makeRequest(): js.Promise[BaseResponse] = js.native
    def makeRequest(options: BaseRequestOptions): js.Promise[BaseResponse] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: js.Function1[/* options */ js.UndefOr[BaseRequestOptions], js.Promise[BaseResponse]] = js.native
    
    def table[TFields /* <: FieldSet */](tableName: String): ^[TFields] = js.native
    @JSName("table")
    var table_Original: js.Function1[/* tableName */ String, ^[FieldSet]] = js.native
  }
}
