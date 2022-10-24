package typings.airtable

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.airtable.anon.PickAirtableOptionsapiKey
import typings.airtable.anon.TypeofAirtableTable
import typings.airtable.anon.TypeofBase
import typings.airtable.libAirtableBaseMod.AirtableBase
import typings.airtable.libObjectMapMod.ObjectMap
import typings.airtable.libQueryParamsMod.QueryParams
import typings.airtable.libRecordMod.RecordJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("airtable", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Airtable {
    def this(opts: AirtableOptions) = this()
    
    /* CompleteClass */
    override val _apiKey: String = js.native
    
    /* CompleteClass */
    override val _apiVersion: String = js.native
    
    /* CompleteClass */
    override val _apiVersionMajor: String = js.native
    
    /* CompleteClass */
    override val _customHeaders: CustomHeaders = js.native
    
    /* CompleteClass */
    override val _endpointUrl: String = js.native
    
    /* CompleteClass */
    override val _noRetryIfRateLimited: Boolean = js.native
    
    /* CompleteClass */
    override val _requestTimeout: Double = js.native
    
    /* CompleteClass */
    override def base(baseId: String): Base_ = js.native
  }
  @JSImport("airtable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("airtable", "Base")
  @js.native
  open class BaseCls protected ()
    extends typings.airtable.libBaseMod.^ {
    def this(airtable: typings.airtable.mod.^, baseId: String) = this()
  }
  
  /* static member */
  @JSImport("airtable", "Base")
  @js.native
  def Base_ : TypeofBase & (Instantiable2[
    /* airtable */ typings.airtable.mod.^, 
    /* baseId */ String, 
    typings.airtable.libBaseMod.^
  ]) = js.native
  
  type Base_ = AirtableBase
  inline def Base__=(
    x: TypeofBase & (Instantiable2[
      /* airtable */ typings.airtable.mod.^, 
      /* baseId */ String, 
      typings.airtable.libBaseMod.^
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Base")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "Error")
  @js.native
  def Error: Instantiable3[
    /* error */ String, 
    /* message */ String, 
    /* statusCode */ Double, 
    typings.airtable.libAirtableErrorMod.^
  ] = js.native
  type Error = typings.airtable.libAirtableErrorMod.^
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("airtable", "Error")
  @js.native
  open class ErrorCls protected ()
    extends typings.airtable.libAirtableErrorMod.^ {
    def this(error: String, message: String, statusCode: Double) = this()
  }
  
  inline def Error_=(
    x: Instantiable3[
      /* error */ String, 
      /* message */ String, 
      /* statusCode */ Double, 
      typings.airtable.libAirtableErrorMod.^
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "Record")
  @js.native
  def Record: Instantiable3[
    /* table */ typings.airtable.libTableMod.^[/* import warning: RewrittenClass.unapply cls was tparam TFields */ Any], 
    /* recordId */ String, 
    /* recordJson */ js.UndefOr[RecordJson], 
    typings.airtable.libRecordMod.^[typings.airtable.libFieldSetMod.FieldSet]
  ] = js.native
  type Record[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] = typings.airtable.libRecordMod.^[TFields]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("airtable", "Record")
  @js.native
  open class RecordCls[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] protected ()
    extends typings.airtable.libRecordMod.^[TFields] {
    def this(
      table: typings.airtable.libTableMod.^[/* import warning: RewrittenClass.unapply cls was tparam TFields */ Any],
      recordId: String
    ) = this()
    def this(
      table: typings.airtable.libTableMod.^[/* import warning: RewrittenClass.unapply cls was tparam TFields */ Any],
      recordId: String,
      recordJson: RecordJson
    ) = this()
  }
  
  inline def Record_=(
    x: Instantiable3[
      /* table */ typings.airtable.libTableMod.^[/* import warning: RewrittenClass.unapply cls was tparam TFields */ Any], 
      /* recordId */ String, 
      /* recordJson */ js.UndefOr[RecordJson], 
      typings.airtable.libRecordMod.^[typings.airtable.libFieldSetMod.FieldSet]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Record")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "Table")
  @js.native
  def Table: TypeofAirtableTable & (Instantiable3[
    /* base */ typings.airtable.libBaseMod.^, 
    /* tableId */ String, 
    /* tableName */ String, 
    typings.airtable.libTableMod.^[typings.airtable.libFieldSetMod.FieldSet]
  ]) = js.native
  type Table[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] = typings.airtable.libTableMod.^[TFields]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("airtable", "Table")
  @js.native
  open class TableCls[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] protected ()
    extends typings.airtable.libTableMod.^[TFields] {
    def this(base: typings.airtable.libBaseMod.^, tableId: String, tableName: String) = this()
  }
  
  inline def Table_=(
    x: TypeofAirtableTable & (Instantiable3[
      /* base */ typings.airtable.libBaseMod.^, 
      /* tableId */ String, 
      /* tableName */ String, 
      typings.airtable.libTableMod.^[typings.airtable.libFieldSetMod.FieldSet]
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Table")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "apiKey")
  @js.native
  def apiKey: String = js.native
  inline def apiKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "apiVersion")
  @js.native
  def apiVersion: String = js.native
  inline def apiVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def base(baseId: String): Base_ = ^.asInstanceOf[js.Dynamic].applyDynamic("base")(baseId.asInstanceOf[js.Any]).asInstanceOf[Base_]
  
  /* static member */
  inline def configure(param0: PickAirtableOptionsapiKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def defaultConfig(): AirtableOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default_config")().asInstanceOf[AirtableOptions]
  
  /* static member */
  @JSImport("airtable", "endpointUrl")
  @js.native
  def endpointUrl: String = js.native
  inline def endpointUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "noRetryIfRateLimited")
  @js.native
  def noRetryIfRateLimited: Boolean = js.native
  inline def noRetryIfRateLimited_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noRetryIfRateLimited")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("airtable", "requestTimeout")
  @js.native
  def requestTimeout: Double = js.native
  inline def requestTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(x.asInstanceOf[js.Any])
  
  trait Airtable extends StObject {
    
    val _apiKey: String
    
    val _apiVersion: String
    
    val _apiVersionMajor: String
    
    val _customHeaders: CustomHeaders
    
    val _endpointUrl: String
    
    val _noRetryIfRateLimited: Boolean
    
    val _requestTimeout: Double
    
    def base(baseId: String): Base_
  }
  object Airtable {
    
    inline def apply(
      _apiKey: String,
      _apiVersion: String,
      _apiVersionMajor: String,
      _customHeaders: CustomHeaders,
      _endpointUrl: String,
      _noRetryIfRateLimited: Boolean,
      _requestTimeout: Double,
      base: String => Base_
    ): Airtable = {
      val __obj = js.Dynamic.literal(_apiKey = _apiKey.asInstanceOf[js.Any], _apiVersion = _apiVersion.asInstanceOf[js.Any], _apiVersionMajor = _apiVersionMajor.asInstanceOf[js.Any], _customHeaders = _customHeaders.asInstanceOf[js.Any], _endpointUrl = _endpointUrl.asInstanceOf[js.Any], _noRetryIfRateLimited = _noRetryIfRateLimited.asInstanceOf[js.Any], _requestTimeout = _requestTimeout.asInstanceOf[js.Any], base = js.Any.fromFunction1(base))
      __obj.asInstanceOf[Airtable]
    }
    
    extension [Self <: Airtable](x: Self) {
      
      inline def setBase(value: String => Base_): Self = StObject.set(x, "base", js.Any.fromFunction1(value))
      
      inline def set_apiKey(value: String): Self = StObject.set(x, "_apiKey", value.asInstanceOf[js.Any])
      
      inline def set_apiVersion(value: String): Self = StObject.set(x, "_apiVersion", value.asInstanceOf[js.Any])
      
      inline def set_apiVersionMajor(value: String): Self = StObject.set(x, "_apiVersionMajor", value.asInstanceOf[js.Any])
      
      inline def set_customHeaders(value: CustomHeaders): Self = StObject.set(x, "_customHeaders", value.asInstanceOf[js.Any])
      
      inline def set_endpointUrl(value: String): Self = StObject.set(x, "_endpointUrl", value.asInstanceOf[js.Any])
      
      inline def set_noRetryIfRateLimited(value: Boolean): Self = StObject.set(x, "_noRetryIfRateLimited", value.asInstanceOf[js.Any])
      
      inline def set_requestTimeout(value: Double): Self = StObject.set(x, "_requestTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait AirtableOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var customHeaders: js.UndefOr[CustomHeaders] = js.undefined
    
    var endpointUrl: js.UndefOr[String] = js.undefined
    
    var noRetryIfRateLimited: js.UndefOr[Boolean] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
  }
  object AirtableOptions {
    
    inline def apply(): AirtableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AirtableOptions]
    }
    
    extension [Self <: AirtableOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setCustomHeaders(value: CustomHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      inline def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
      
      inline def setNoRetryIfRateLimited(value: Boolean): Self = StObject.set(x, "noRetryIfRateLimited", value.asInstanceOf[js.Any])
      
      inline def setNoRetryIfRateLimitedUndefined: Self = StObject.set(x, "noRetryIfRateLimited", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
  
  type Attachment = typings.airtable.libAttachmentMod.Attachment
  
  type Collaborator = typings.airtable.libCollaboratorMod.Collaborator
  
  type CustomHeaders = ObjectMap[String, String | Double | Boolean]
  
  type FieldSet = typings.airtable.libFieldSetMod.FieldSet
  
  type Query[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] = typings.airtable.libQueryMod.^[TFields]
  
  type RecordData[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] = typings.airtable.libRecordDataMod.RecordData[TFields]
  
  type Records[TFields /* <: typings.airtable.libFieldSetMod.FieldSet */] = typings.airtable.libRecordsMod.Records[TFields]
  
  type SelectOptions[TFields] = QueryParams[TFields]
  
  type Thumbnail = typings.airtable.libThumbnailMod.Thumbnail
}
