package typings.airtable

import typings.airtable.airtableStrings.asc
import typings.airtable.airtableStrings.desc
import typings.airtable.airtableStrings.json
import typings.airtable.airtableStrings.string
import typings.airtable.anon.Error
import typings.airtable.anon.Field
import typings.airtable.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueryParamsMod {
  
  @JSImport("airtable/lib/query_params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("airtable/lib/query_params", "URL_CHARACTER_LENGTH_LIMIT")
  @js.native
  val URL_CHARACTER_LENGTH_LIMIT: /* 15000 */ Double = js.native
  
  object paramValidators {
    
    @JSImport("airtable/lib/query_params", "paramValidators")
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
    
    inline def sort(value: js.Array[Field]): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def timeZone(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("timeZone")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def userLocale(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("userLocale")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
    
    inline def view(value: String): Pass | Error = ^.asInstanceOf[js.Dynamic].applyDynamic("view")(value.asInstanceOf[js.Any]).asInstanceOf[Pass | Error]
  }
  
  inline def shouldListRecordsParamBePassedAsParameter(paramName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldListRecordsParamBePassedAsParameter")(paramName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait QueryParams[TFields] extends StObject {
    
    var cellFormat: js.UndefOr[json | string] = js.undefined
    
    var fields: js.UndefOr[js.Array[/* keyof TFields */ String]] = js.undefined
    
    var filterByFormula: js.UndefOr[String] = js.undefined
    
    var maxRecords: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var returnFieldsByFieldId: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[js.Array[SortParameter[TFields]]] = js.undefined
    
    var timeZone: js.UndefOr[String] = js.undefined
    
    var userLocale: js.UndefOr[String] = js.undefined
    
    var view: js.UndefOr[String] = js.undefined
  }
  object QueryParams {
    
    inline def apply[TFields](): QueryParams[TFields] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParams[TFields]]
    }
    
    extension [Self <: QueryParams[?], TFields](x: Self & QueryParams[TFields]) {
      
      inline def setCellFormat(value: json | string): Self = StObject.set(x, "cellFormat", value.asInstanceOf[js.Any])
      
      inline def setCellFormatUndefined: Self = StObject.set(x, "cellFormat", js.undefined)
      
      inline def setFields(value: js.Array[/* keyof TFields */ String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: (/* keyof TFields */ String)*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFilterByFormula(value: String): Self = StObject.set(x, "filterByFormula", value.asInstanceOf[js.Any])
      
      inline def setFilterByFormulaUndefined: Self = StObject.set(x, "filterByFormula", js.undefined)
      
      inline def setMaxRecords(value: Double): Self = StObject.set(x, "maxRecords", value.asInstanceOf[js.Any])
      
      inline def setMaxRecordsUndefined: Self = StObject.set(x, "maxRecords", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setReturnFieldsByFieldId(value: Boolean): Self = StObject.set(x, "returnFieldsByFieldId", value.asInstanceOf[js.Any])
      
      inline def setReturnFieldsByFieldIdUndefined: Self = StObject.set(x, "returnFieldsByFieldId", js.undefined)
      
      inline def setSort(value: js.Array[SortParameter[TFields]]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortVarargs(value: SortParameter[TFields]*): Self = StObject.set(x, "sort", js.Array(value*))
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
      
      inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait SortParameter[TFields] extends StObject {
    
    var direction: js.UndefOr[asc | desc] = js.undefined
    
    var field: /* keyof TFields */ String
  }
  object SortParameter {
    
    inline def apply[TFields](field: /* keyof TFields */ String): SortParameter[TFields] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortParameter[TFields]]
    }
    
    extension [Self <: SortParameter[?], TFields](x: Self & SortParameter[TFields]) {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setField(value: /* keyof TFields */ String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
}
