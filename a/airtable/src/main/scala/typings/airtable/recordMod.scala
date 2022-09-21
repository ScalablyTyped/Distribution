package typings.airtable

import typings.airtable.fieldSetMod.FieldSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  @JSImport("airtable/lib/record", JSImport.Namespace)
  @js.native
  open class ^[TFields /* <: FieldSet */] protected ()
    extends StObject
       with Record[TFields] {
    def this(table: typings.airtable.tableMod.^[TFields], recordId: String) = this()
    def this(table: typings.airtable.tableMod.^[TFields], recordId: String, recordJson: RecordJson) = this()
  }
  
  trait OptionalParameters extends StObject {
    
    var typecast: Boolean
  }
  object OptionalParameters {
    
    inline def apply(typecast: Boolean): OptionalParameters = {
      val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionalParameters]
    }
    
    extension [Self <: OptionalParameters](x: Self) {
      
      inline def setTypecast(value: Boolean): Self = StObject.set(x, "typecast", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Record[TFields /* <: FieldSet */] extends StObject {
    
    var _rawJson: RecordJson = js.native
    
    val _table: typings.airtable.tableMod.^[TFields] = js.native
    
    def destroy(): js.Promise[Record[TFields]] = js.native
    def destroy(done: RecordCallback[TFields]): Unit = js.native
    
    def fetch(): js.Promise[Record[TFields]] = js.native
    def fetch(done: RecordCallback[TFields]): Unit = js.native
    
    var fields: TFields = js.native
    
    def get[Field /* <: /* keyof TFields */ String */](columnName: Field): /* import warning: importer.ImportType#apply Failed type conversion: TFields[Field] */ js.Any = js.native
    
    def getId(): String = js.native
    
    val id: String = js.native
    
    def patchUpdate(cellValuesByName: TFields): js.Promise[Record[TFields]] = js.native
    def patchUpdate(cellValuesByName: TFields, done: RecordCallback[TFields]): Unit = js.native
    def patchUpdate(cellValuesByName: TFields, opts: OptionalParameters): js.Promise[Record[TFields]] = js.native
    def patchUpdate(cellValuesByName: TFields, opts: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
    
    def putUpdate(cellValuesByName: TFields): js.Promise[Record[TFields]] = js.native
    def putUpdate(cellValuesByName: TFields, done: RecordCallback[TFields]): Unit = js.native
    def putUpdate(cellValuesByName: TFields, opts: OptionalParameters): js.Promise[Record[TFields]] = js.native
    def putUpdate(cellValuesByName: TFields, opts: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
    
    def replaceFields(cellValuesByName: TFields): js.Promise[Record[TFields]] = js.native
    def replaceFields(cellValuesByName: TFields, done: RecordCallback[TFields]): Unit = js.native
    def replaceFields(cellValuesByName: TFields, opts: OptionalParameters): js.Promise[Record[TFields]] = js.native
    def replaceFields(cellValuesByName: TFields, opts: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
    
    def save(): js.Promise[Record[TFields]] = js.native
    def save(done: RecordCallback[TFields]): Unit = js.native
    
    def set[Field /* <: /* keyof TFields */ String */](
      columnName: Field,
      columnValue: /* import warning: importer.ImportType#apply Failed type conversion: TFields[Field] */ js.Any
    ): Unit = js.native
    
    def setRawJson(rawJson: RecordJson): Unit = js.native
    
    def updateFields(cellValuesByName: TFields): js.Promise[Record[TFields]] = js.native
    def updateFields(cellValuesByName: TFields, done: RecordCallback[TFields]): Unit = js.native
    def updateFields(cellValuesByName: TFields, opts: OptionalParameters): js.Promise[Record[TFields]] = js.native
    def updateFields(cellValuesByName: TFields, opts: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
  }
  
  @js.native
  trait RecordActionMethod[TFields /* <: FieldSet */] extends StObject {
    
    def apply(): js.Promise[Record[TFields]] = js.native
    def apply(done: RecordCallback[TFields]): Unit = js.native
  }
  
  @js.native
  trait RecordCallback[TFields /* <: FieldSet */] extends StObject {
    
    def apply(error: Null, record: Record[TFields]): Unit = js.native
    def apply(error: RecordError): Unit = js.native
  }
  
  @js.native
  trait RecordChangeMethod[TFields /* <: FieldSet */] extends StObject {
    
    def apply(cellValuesByName: TFields): js.Promise[Record[TFields]] = js.native
    def apply(cellValuesByName: TFields, done: RecordCallback[TFields]): Unit = js.native
    def apply(cellValuesByName: TFields, opts: OptionalParameters): js.Promise[Record[TFields]] = js.native
    def apply(cellValuesByName: TFields, opts: OptionalParameters, done: RecordCallback[TFields]): Unit = js.native
  }
  
  type RecordError = Any
  
  type RecordJson = Any
}
