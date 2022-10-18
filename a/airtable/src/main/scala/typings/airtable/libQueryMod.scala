package typings.airtable

import typings.airtable.airtableStrings.json
import typings.airtable.airtableStrings.string
import typings.airtable.anon.Direction
import typings.airtable.anon.Error
import typings.airtable.anon.Errors
import typings.airtable.anon.Pass
import typings.airtable.libFieldSetMod.FieldSet
import typings.airtable.libQueryParamsMod.QueryParams
import typings.airtable.libRecordsMod.Records
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueryMod {
  
  /**
    * Builds a query object. Won't fetch until `firstPage` or
    * or `eachPage` is called.
    *
    * Params should be validated prior to being passed to Query
    * with `Query.validateParams`.
    */
  @JSImport("airtable/lib/query", JSImport.Namespace)
  @js.native
  open class ^[TFields /* <: FieldSet */] protected ()
    extends StObject
       with Query[TFields] {
    def this(table: typings.airtable.libTableMod.^[TFields], params: QueryParams[TFields]) = this()
  }
  @JSImport("airtable/lib/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object paramValidators {
    
    @JSImport("airtable/lib/query", "paramValidators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cellFormat(value: string | json): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("cellFormat")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def fields(value: js.Array[String]): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("fields")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def filterByFormula(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("filterByFormula")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def maxRecords(value: Double): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("maxRecords")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def method(value: string | json): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def offset(value: Double): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def pageSize(value: Double): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("pageSize")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def returnFieldsByFieldId(value: Boolean): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("returnFieldsByFieldId")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def sort(value: js.Array[Direction]): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def timeZone(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("timeZone")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def userLocale(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("userLocale")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def view(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("view")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
  }
  
  /**
    * Validates the parameters for passing to the Query constructor.
    *
    * @params {object} params parameters to validate
    *
    * @return an object with two keys:
    *  validParams: the object that should be passed to the constructor.
    *  ignoredKeys: a list of keys that will be ignored.
    *  errors: a list of error messages.
    */
  /* static member */
  inline def validateParams[TFields /* <: FieldSet */, Params /* <: QueryParams[TFields] */](params: Params): Errors[TFields] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateParams")(params.asInstanceOf[js.Any]).asInstanceOf[Errors[TFields]]
  
  type CallbackError = Any
  
  type DoneCallback = js.Function1[/* error */ CallbackError, Unit]
  
  type PageCallback[TFields /* <: FieldSet */] = js.Function2[/* records */ Records[TFields], /* processNextPage */ js.Function0[Unit], Unit]
  
  /**
    * Builds a query object. Won't fetch until `firstPage` or
    * or `eachPage` is called.
    *
    * Params should be validated prior to being passed to Query
    * with `Query.validateParams`.
    */
  @js.native
  trait Query[TFields /* <: FieldSet */] extends StObject {
    
    val _params: QueryParams[TFields] = js.native
    
    val _table: typings.airtable.libTableMod.^[TFields] = js.native
    
    def all(): js.Promise[Records[TFields]] = js.native
    def all(done: RecordCollectionCallback[TFields]): Unit = js.native
    
    def eachPage(pageCallback: PageCallback[TFields]): js.Promise[Unit] = js.native
    def eachPage(pageCallback: PageCallback[TFields], done: DoneCallback): Unit = js.native
    
    def firstPage(): js.Promise[Records[TFields]] = js.native
    def firstPage(done: RecordCollectionCallback[TFields]): Unit = js.native
  }
  
  type RecordCollectionCallback[TFields /* <: FieldSet */] = js.Function2[/* error */ CallbackError, /* records */ js.UndefOr[Records[TFields]], Unit]
  
  @js.native
  trait RecordCollectionRequestMethod[TFields /* <: FieldSet */] extends StObject {
    
    def apply(): js.Promise[Records[TFields]] = js.native
    def apply(done: RecordCollectionCallback[TFields]): Unit = js.native
  }
  
  @js.native
  trait RecordPageIteratationMethod[TFields /* <: FieldSet */] extends StObject {
    
    def apply(pageCallback: PageCallback[TFields]): js.Promise[Unit] = js.native
    def apply(pageCallback: PageCallback[TFields], done: DoneCallback): Unit = js.native
  }
}
