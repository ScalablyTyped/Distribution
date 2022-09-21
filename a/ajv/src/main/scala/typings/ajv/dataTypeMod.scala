package typings.ajv

import typings.ajv.ajvStrings.`type`
import typings.ajv.ajvStrings.log
import typings.ajv.anon.Type
import typings.ajv.codeMod.Code
import typings.ajv.codegenMod.Name
import typings.ajv.compileMod.SchemaObjCxt
import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.rulesMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTypeMod {
  
  @JSImport("ajv/dist/compile/validate/dataType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DataType extends StObject
  @JSImport("ajv/dist/compile/validate/dataType", "DataType")
  @js.native
  object DataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DataType & Double] = js.native
    
    @js.native
    sealed trait Correct
      extends StObject
         with DataType
    /* 0 */ val Correct: typings.ajv.dataTypeMod.DataType.Correct & Double = js.native
    
    @js.native
    sealed trait Wrong
      extends StObject
         with DataType
    /* 1 */ val Wrong: typings.ajv.dataTypeMod.DataType.Wrong & Double = js.native
  }
  
  inline def checkDataType(dataType: JSONType, data: Name): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataType")(dataType.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataType(dataType: JSONType, data: Name, strictNums: Boolean): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataType")(dataType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataType(dataType: JSONType, data: Name, strictNums: Boolean, correct: DataType): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataType")(dataType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any], correct.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataType(dataType: JSONType, data: Name, strictNums: Unit, correct: DataType): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataType")(dataType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any], correct.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def checkDataType_log(dataType: JSONType, data: Name, strictNums: log): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataType")(dataType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataType_log(dataType: JSONType, data: Name, strictNums: log, correct: DataType): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataType")(dataType.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any], correct.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def checkDataTypes(dataTypes: js.Array[JSONType], data: Name): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataTypes")(dataTypes.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataTypes(dataTypes: js.Array[JSONType], data: Name, strictNums: Boolean): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataTypes")(dataTypes.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataTypes(dataTypes: js.Array[JSONType], data: Name, strictNums: Boolean, correct: DataType): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataTypes")(dataTypes.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any], correct.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataTypes(dataTypes: js.Array[JSONType], data: Name, strictNums: Unit, correct: DataType): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataTypes")(dataTypes.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any], correct.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def checkDataTypes_log(dataTypes: js.Array[JSONType], data: Name, strictNums: log): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataTypes")(dataTypes.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def checkDataTypes_log(dataTypes: js.Array[JSONType], data: Name, strictNums: log, correct: DataType): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataTypes")(dataTypes.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strictNums.asInstanceOf[js.Any], correct.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def coerceAndCheckDataType(it: SchemaObjCxt, types: js.Array[JSONType]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("coerceAndCheckDataType")(it.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getJSONTypes(ts: js.Array[Any]): js.Array[JSONType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSONTypes")(ts.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSONType]]
  inline def getJSONTypes(ts: Any): js.Array[JSONType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSONTypes")(ts.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSONType]]
  
  inline def getSchemaTypes(schema: AnySchemaObject): js.Array[JSONType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaTypes")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSONType]]
  
  inline def reportTypeError(it: SchemaObjCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportTypeError")(it.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type TypeError = ErrorObject[`type`, Type, Any]
}
