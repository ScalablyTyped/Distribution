package typings.airtable

import typings.airtable.airtableBooleans.`false`
import typings.airtable.airtableBooleans.`true`
import typings.airtable.airtableStrings.asc
import typings.airtable.airtableStrings.desc
import typings.airtable.libAirtableBaseMod.AirtableBase
import typings.airtable.libFieldSetMod.FieldSet
import typings.airtable.libQueryParamsMod.QueryParams
import typings.airtable.libThumbnailMod.Thumbnail
import typings.airtable.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction extends StObject {
    
    var direction: js.UndefOr[desc | asc] = js.undefined
    
    var field: String
  }
  object Direction {
    
    inline def apply(field: String): Direction = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: desc | asc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: String
    
    var pass: `false`
  }
  object Error {
    
    inline def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pass = false)
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPass(value: `false`): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorPass[Error] extends StObject {
    
    var error: Error
    
    var pass: `false`
  }
  object ErrorPass {
    
    inline def apply[Error](error: Error): ErrorPass[Error] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pass = false)
      __obj.asInstanceOf[ErrorPass[Error]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorPass[?], Error] (val x: Self & ErrorPass[Error]) extends AnyVal {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPass(value: `false`): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors[TFields /* <: FieldSet */] extends StObject {
    
    var errors: js.Array[String]
    
    var ignoredKeys: js.Array[String]
    
    var validParams: QueryParams[TFields]
  }
  object Errors {
    
    inline def apply[TFields /* <: FieldSet */](errors: js.Array[String], ignoredKeys: js.Array[String], validParams: QueryParams[TFields]): Errors[TFields] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], ignoredKeys = ignoredKeys.asInstanceOf[js.Any], validParams = validParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors[TFields]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors[?], TFields /* <: FieldSet */] (val x: Self & Errors[TFields]) extends AnyVal {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setIgnoredKeys(value: js.Array[String]): Self = StObject.set(x, "ignoredKeys", value.asInstanceOf[js.Any])
      
      inline def setIgnoredKeysVarargs(value: String*): Self = StObject.set(x, "ignoredKeys", js.Array(value*))
      
      inline def setValidParams(value: QueryParams[TFields]): Self = StObject.set(x, "validParams", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var direction: js.UndefOr[asc | desc] = js.undefined
    
    var field: String
  }
  object Field {
    
    inline def apply(field: String): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  trait Full extends StObject {
    
    var full: Thumbnail
    
    var large: Thumbnail
    
    var small: Thumbnail
  }
  object Full {
    
    inline def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      inline def setFull(value: Thumbnail): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setLarge(value: Thumbnail): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: Thumbnail): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pass extends StObject {
    
    var pass: `true`
  }
  object Pass {
    
    inline def apply(): Pass = {
      val __obj = js.Dynamic.literal(pass = true)
      __obj.asInstanceOf[Pass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
      
      inline def setPass(value: `true`): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<airtable.airtable.AirtableOptions, 'apiKey' | 'endpointUrl' | 'apiVersion' | 'noRetryIfRateLimited' | 'requestTimeout'> */
  trait PickAirtableOptionsapiKey extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var endpointUrl: js.UndefOr[String] = js.undefined
    
    var noRetryIfRateLimited: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
  }
  object PickAirtableOptionsapiKey {
    
    inline def apply(): PickAirtableOptionsapiKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAirtableOptionsapiKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickAirtableOptionsapiKey] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      inline def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
      
      inline def setNoRetryIfRateLimited(value: Boolean): Self = StObject.set(x, "noRetryIfRateLimited", value.asInstanceOf[js.Any])
      
      inline def setNoRetryIfRateLimitedUndefined: Self = StObject.set(x, "noRetryIfRateLimited", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
  
  trait TypeofAirtableTable extends StObject {
    
    /* static member */
    var __recordsPerPageForIteration: Double
  }
  object TypeofAirtableTable {
    
    inline def apply(__recordsPerPageForIteration: Double): TypeofAirtableTable = {
      val __obj = js.Dynamic.literal(__recordsPerPageForIteration = __recordsPerPageForIteration.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofAirtableTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofAirtableTable] (val x: Self) extends AnyVal {
      
      inline def set__recordsPerPageForIteration(value: Double): Self = StObject.set(x, "__recordsPerPageForIteration", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofBase extends StObject {
    
    /* static member */
    def createFunctor(airtable: ^, baseId: String): AirtableBase
  }
  object TypeofBase {
    
    inline def apply(createFunctor: (^, String) => AirtableBase): TypeofBase = {
      val __obj = js.Dynamic.literal(createFunctor = js.Any.fromFunction2(createFunctor))
      __obj.asInstanceOf[TypeofBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofBase] (val x: Self) extends AnyVal {
      
      inline def setCreateFunctor(value: (^, String) => AirtableBase): Self = StObject.set(x, "createFunctor", js.Any.fromFunction2(value))
    }
  }
}
