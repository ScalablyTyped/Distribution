package typings.architectFunctions

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.dynamodbMod.DocumentClient
import typings.awsSdk.dynamodbMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesMod {
  
  trait ArcData extends StObject {
    
    def _name(tableName: String): js.UndefOr[String]
    
    def name(tableName: String): js.UndefOr[String]
  }
  object ArcData {
    
    inline def apply(_name: String => js.UndefOr[String], name: String => js.UndefOr[String]): ArcData = {
      val __obj = js.Dynamic.literal(_name = js.Any.fromFunction1(_name), name = js.Any.fromFunction1(name))
      __obj.asInstanceOf[ArcData]
    }
    
    extension [Self <: ArcData](x: Self) {
      
      inline def setName(value: String => js.UndefOr[String]): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      inline def set_name(value: String => js.UndefOr[String]): Self = StObject.set(x, "_name", js.Any.fromFunction1(value))
    }
  }
  
  trait ArcDataIndexable
    extends StObject
       with ArcData
       with /* tableName */ StringDictionary[ArcTable]
  object ArcDataIndexable {
    
    inline def apply(_name: String => js.UndefOr[String], name: String => js.UndefOr[String]): ArcDataIndexable = {
      val __obj = js.Dynamic.literal(_name = js.Any.fromFunction1(_name), name = js.Any.fromFunction1(name))
      __obj.asInstanceOf[ArcDataIndexable]
    }
  }
  
  @js.native
  trait ArcTable extends StObject {
    
    def delete(key: Key): js.Promise[Any] = js.native
    def delete(key: Key, callback: DeleteCallback): Unit = js.native
    
    def get(key: Key): js.Promise[Any] = js.native
    def get(key: Key, callback: GetCallback): Unit = js.native
    
    def put(key: Key): js.Promise[Any] = js.native
    def put(key: Key, callback: PutCallback): Unit = js.native
    
    def query(params: Any): js.Promise[Any] = js.native
    def query(params: Any, callback: QueryCallback): Unit = js.native
    
    def scan(params: Any): js.Promise[Any] = js.native
    def scan(params: Any, callback: ScanCallback): Unit = js.native
    
    def update(params: Any): js.Promise[Any] = js.native
    def update(params: Any, callback: UpdateCallback): Unit = js.native
  }
  
  @js.native
  trait ArcTables extends StObject {
    
    def apply(): js.Promise[ArcDataIndexable] = js.native
    
    var db: ^ = js.native
    
    var doc: DocumentClient = js.native
  }
  
  type DeleteCallback = GenericCallback
  
  type GenericCallback = js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  
  type GetCallback = GenericCallback
  
  type Key = Any
  
  type PutCallback = GenericCallback
  
  type QueryCallback = GenericCallback
  
  type ScanCallback = GenericCallback
  
  type UpdateCallback = GenericCallback
}
