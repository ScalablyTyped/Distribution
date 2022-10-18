package typings.airtable

import typings.airtable.airtableStrings.get
import typings.airtable.airtableStrings.post
import typings.airtable.libFieldSetMod.FieldSet
import typings.airtable.libQueryParamsMod.QueryParams
import typings.airtable.libRecordDataMod.RecordData
import typings.airtable.libRecordsMod.Records
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableMod {
  
  @JSImport("airtable/lib/table", JSImport.Namespace)
  @js.native
  open class ^[TFields /* <: FieldSet */] protected ()
    extends StObject
       with Table[TFields] {
    def this(base: typings.airtable.libBaseMod.^, tableId: String, tableName: String) = this()
  }
  @JSImport("airtable/lib/table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("airtable/lib/table", "__recordsPerPageForIteration")
  @js.native
  def recordsPerPageForIteration: Double = js.native
  
  inline def recordsPerPageForIteration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__recordsPerPageForIteration")(x.asInstanceOf[js.Any])
  
  /* Inlined std.Pick<airtable.airtable/lib/record_data.RecordData<std.Partial<TFields>>, 'fields'> */
  trait CreateRecord[TFields] extends StObject {
    
    var fields: Partial[TFields]
  }
  object CreateRecord {
    
    inline def apply[TFields](fields: Partial[TFields]): CreateRecord[TFields] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateRecord[TFields]]
    }
    
    extension [Self <: CreateRecord[?], TFields](x: Self & CreateRecord[TFields]) {
      
      inline def setFields(value: Partial[TFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  type CreateRecords[TFields] = js.Array[CreateRecord[TFields] | Partial[TFields] | String]
  
  trait OptionalParameters extends StObject {
    
    var method: js.UndefOr[get | post] = js.undefined
    
    var typecast: js.UndefOr[Boolean] = js.undefined
  }
  object OptionalParameters {
    
    inline def apply(): OptionalParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalParameters]
    }
    
    extension [Self <: OptionalParameters](x: Self) {
      
      inline def setMethod(value: get | post): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setTypecast(value: Boolean): Self = StObject.set(x, "typecast", value.asInstanceOf[js.Any])
      
      inline def setTypecastUndefined: Self = StObject.set(x, "typecast", js.undefined)
    }
  }
  
  type RecordCallback[TFields /* <: FieldSet */] = js.Function2[
    /* error */ TableError, 
    /* record */ js.UndefOr[
      Record[
        TFields, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
      ]
    ], 
    Unit
  ]
  
  type RecordCollectionCallback[TFields /* <: FieldSet */] = js.Function2[/* error */ TableError, /* records */ js.UndefOr[Records[TFields]], Unit]
  
  type RecordForEachCallback[TFields /* <: FieldSet */] = js.Function1[
    /* record */ Record[
      TFields, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ], 
    Unit
  ]
  
  type RecordForEachDoneCallback = js.Function1[/* error */ js.UndefOr[TableError], Unit]
  
  type RecordListCallback[TFields /* <: FieldSet */] = js.Function3[
    /* error */ TableError, 
    /* records */ js.UndefOr[Records[TFields]], 
    /* offset */ js.UndefOr[Double], 
    Unit
  ]
  
  @js.native
  trait Table[TFields /* <: FieldSet */] extends StObject {
    
    val _base: typings.airtable.libBaseMod.^ = js.native
    
    def _createRecords(recordData: TFields, done: RecordCallback[TFields]): Unit = js.native
    def _createRecords(recordData: TFields, optionalParameters: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
    def _createRecords(recordsData: js.Array[TFields], done: RecordCollectionCallback[TFields]): Unit = js.native
    def _createRecords(
      recordsData: js.Array[TFields],
      optionalParameters: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
    
    def _destroyRecord(recordId: String, done: RecordCallback[TFields]): Unit = js.native
    def _destroyRecord(recordIds: js.Array[String], done: RecordCollectionCallback[TFields]): Unit = js.native
    
    def _findRecordById(recordId: String, done: RecordCallback[TFields]): Unit = js.native
    
    def _forEachRecord(
      opts: OptionalParameters,
      callback: RecordForEachCallback[TFields],
      done: RecordForEachDoneCallback
    ): Unit = js.native
    
    def _listRecords(pageSize: Double, offset: Double, opts: OptionalParameters): Unit = js.native
    def _listRecords(pageSize: Double, offset: Double, opts: OptionalParameters, done: RecordListCallback[TFields]): Unit = js.native
    def _listRecords(pageSize: Double, offset: Double, opts: RecordListCallback[TFields]): Unit = js.native
    def _listRecords(
      pageSize: Double,
      offset: Double,
      opts: RecordListCallback[TFields],
      done: RecordListCallback[TFields]
    ): Unit = js.native
    
    def _selectRecords(): typings.airtable.libQueryMod.^[TFields] = js.native
    def _selectRecords(params: QueryParams[TFields]): typings.airtable.libQueryMod.^[TFields] = js.native
    
    def _updateRecords(isDestructiveUpdate: Boolean, recordId: String, recordData: TFields, done: RecordCallback[TFields]): Unit = js.native
    def _updateRecords(
      isDestructiveUpdate: Boolean,
      recordId: String,
      recordData: TFields,
      opts: OptionalParameters,
      done: RecordCallback[TFields]
    ): Unit = js.native
    def _updateRecords(
      isDestructiveUpdate: Boolean,
      recordsData: js.Array[TFields],
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
    def _updateRecords(
      isDestructiveUpdate: Boolean,
      recordsData: js.Array[TFields],
      opts: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
    
    def _urlEncodedNameOrId(): String = js.native
    
    def create(recordData: String): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def create(recordData: String, done: RecordCallback[TFields]): Unit = js.native
    def create(recordData: String, optionalParameters: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def create(recordData: String, optionalParameters: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
    def create(recordData: Partial[TFields]): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def create(recordData: Partial[TFields], done: RecordCallback[TFields]): Unit = js.native
    def create(recordData: Partial[TFields], optionalParameters: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def create(
      recordData: Partial[TFields],
      optionalParameters: OptionalParameters,
      done: RecordCallback[TFields]
    ): Unit = js.native
    def create(recordsData: CreateRecords[TFields]): js.Promise[Records[TFields]] = js.native
    def create(recordsData: CreateRecords[TFields], done: RecordCollectionCallback[TFields]): Unit = js.native
    def create(recordsData: CreateRecords[TFields], optionalParameters: OptionalParameters): js.Promise[Records[TFields]] = js.native
    def create(
      recordsData: CreateRecords[TFields],
      optionalParameters: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
    
    def destroy(recordId: String): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def destroy(recordId: String, done: RecordCallback[TFields]): Unit = js.native
    def destroy(recordIds: js.Array[String]): js.Promise[Records[TFields]] = js.native
    def destroy(recordIds: js.Array[String], done: RecordCollectionCallback[TFields]): Unit = js.native
    
    def find(recordId: String): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def find(recordId: String, done: RecordCallback[TFields]): Unit = js.native
    
    /** @deprecated */
    val forEach: Any = js.native
    
    val id: String = js.native
    
    /** @deprecated */
    val list: Any = js.native
    
    val name: String = js.native
    
    def replace(recordId: String, recordData: Partial[TFields]): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def replace(recordId: String, recordData: Partial[TFields], done: RecordCallback[TFields]): Unit = js.native
    def replace(recordId: String, recordData: Partial[TFields], opts: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def replace(
      recordId: String,
      recordData: Partial[TFields],
      opts: OptionalParameters,
      done: RecordCallback[TFields]
    ): Unit = js.native
    def replace(recordsData: js.Array[RecordData[Partial[TFields]]]): js.Promise[Records[TFields]] = js.native
    def replace(recordsData: js.Array[RecordData[Partial[TFields]]], done: RecordCollectionCallback[TFields]): Unit = js.native
    def replace(recordsData: js.Array[RecordData[Partial[TFields]]], opts: OptionalParameters): js.Promise[Records[TFields]] = js.native
    def replace(
      recordsData: js.Array[RecordData[Partial[TFields]]],
      opts: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
    
    def select(): typings.airtable.libQueryMod.^[TFields] = js.native
    def select(params: QueryParams[TFields]): typings.airtable.libQueryMod.^[TFields] = js.native
    
    def update(recordId: String, recordData: Partial[TFields]): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def update(recordId: String, recordData: Partial[TFields], done: RecordCallback[TFields]): Unit = js.native
    def update(recordId: String, recordData: Partial[TFields], opts: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def update(
      recordId: String,
      recordData: Partial[TFields],
      opts: OptionalParameters,
      done: RecordCallback[TFields]
    ): Unit = js.native
    def update(recordsData: js.Array[RecordData[Partial[TFields]]]): js.Promise[Records[TFields]] = js.native
    def update(recordsData: js.Array[RecordData[Partial[TFields]]], done: RecordCollectionCallback[TFields]): Unit = js.native
    def update(recordsData: js.Array[RecordData[Partial[TFields]]], opts: OptionalParameters): js.Promise[Records[TFields]] = js.native
    def update(
      recordsData: js.Array[RecordData[Partial[TFields]]],
      opts: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
  }
  
  @js.native
  trait TableChangeRecords[TFields /* <: FieldSet */] extends StObject {
    
    def apply(recordId: String, recordData: Partial[TFields]): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(recordId: String, recordData: Partial[TFields], done: RecordCallback[TFields]): Unit = js.native
    def apply(recordId: String, recordData: Partial[TFields], opts: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(
      recordId: String,
      recordData: Partial[TFields],
      opts: OptionalParameters,
      done: RecordCallback[TFields]
    ): Unit = js.native
    def apply(recordsData: js.Array[RecordData[Partial[TFields]]]): js.Promise[Records[TFields]] = js.native
    def apply(recordsData: js.Array[RecordData[Partial[TFields]]], done: RecordCollectionCallback[TFields]): Unit = js.native
    def apply(recordsData: js.Array[RecordData[Partial[TFields]]], opts: OptionalParameters): js.Promise[Records[TFields]] = js.native
    def apply(
      recordsData: js.Array[RecordData[Partial[TFields]]],
      opts: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
  }
  
  @js.native
  trait TableCreateRecords[TFields /* <: FieldSet */] extends StObject {
    
    def apply(recordData: String): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(recordData: String, done: RecordCallback[TFields]): Unit = js.native
    def apply(recordData: String, optionalParameters: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(recordData: String, optionalParameters: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
    def apply(recordData: Partial[TFields]): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(recordData: Partial[TFields], done: RecordCallback[TFields]): Unit = js.native
    def apply(recordData: Partial[TFields], optionalParameters: OptionalParameters): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(
      recordData: Partial[TFields],
      optionalParameters: OptionalParameters,
      done: RecordCallback[TFields]
    ): Unit = js.native
    def apply(recordsData: CreateRecords[TFields]): js.Promise[Records[TFields]] = js.native
    def apply(recordsData: CreateRecords[TFields], done: RecordCollectionCallback[TFields]): Unit = js.native
    def apply(recordsData: CreateRecords[TFields], optionalParameters: OptionalParameters): js.Promise[Records[TFields]] = js.native
    def apply(
      recordsData: CreateRecords[TFields],
      optionalParameters: OptionalParameters,
      done: RecordCollectionCallback[TFields]
    ): Unit = js.native
  }
  
  @js.native
  trait TableDestroyRecords[TFields /* <: FieldSet */] extends StObject {
    
    def apply(recordId: String): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(recordId: String, done: RecordCallback[TFields]): Unit = js.native
    def apply(recordIds: js.Array[String]): js.Promise[Records[TFields]] = js.native
    def apply(recordIds: js.Array[String], done: RecordCollectionCallback[TFields]): Unit = js.native
  }
  
  type TableError = Any
  
  @js.native
  trait TableFindRecord[TFields /* <: FieldSet */] extends StObject {
    
    def apply(recordId: String): js.Promise[
        Record[
          TFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
      ] = js.native
    def apply(recordId: String, done: RecordCallback[TFields]): Unit = js.native
  }
  
  type TableSelectRecord[TFields /* <: FieldSet */] = js.Function1[
    /* params */ js.UndefOr[QueryParams[TFields]], 
    typings.airtable.libQueryMod.^[TFields]
  ]
}
