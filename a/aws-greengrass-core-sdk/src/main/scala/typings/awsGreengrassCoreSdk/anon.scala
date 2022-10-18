package typings.awsGreengrassCoreSdk

import org.scalablytyped.runtime.Instantiable0
import typings.awsGreengrassCoreSdk.streamManagerDataMessageStreamInfoMod.MessageStreamInfoExportStatuses
import typings.awsGreengrassCoreSdk.streamManagerDataMessageStreamInfoMod.MessageStreamInfoExportStatusesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMessageStreamInfoMod.MessageStreamInfoStorageStatus
import typings.awsGreengrassCoreSdk.streamManagerDataMessageStreamInfoMod.MessageStreamInfoStorageStatusMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.MessageStreamDefinitionMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Definition extends StObject {
    
    var definition: js.UndefOr[MessageStreamDefinitionMap] = js.undefined
    
    var exportStatuses: js.UndefOr[js.Array[MessageStreamInfoExportStatusesMap]] = js.undefined
    
    var storageStatus: js.UndefOr[MessageStreamInfoStorageStatusMap] = js.undefined
  }
  object Definition {
    
    inline def apply(): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setDefinition(value: MessageStreamDefinitionMap): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setExportStatuses(value: js.Array[MessageStreamInfoExportStatusesMap]): Self = StObject.set(x, "exportStatuses", value.asInstanceOf[js.Any])
      
      inline def setExportStatusesUndefined: Self = StObject.set(x, "exportStatuses", js.undefined)
      
      inline def setExportStatusesVarargs(value: MessageStreamInfoExportStatusesMap*): Self = StObject.set(x, "exportStatuses", js.Array(value*))
      
      inline def setStorageStatus(value: MessageStreamInfoStorageStatusMap): Self = StObject.set(x, "storageStatus", value.asInstanceOf[js.Any])
      
      inline def setStorageStatusUndefined: Self = StObject.set(x, "storageStatus", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Any]
  
  trait TypeofMessageStreamInfoEx extends StObject {
    
    /* static member */
    var formatsMap: Record[String, scala.Nothing]
    
    /* static member */
    def fromMap(d: Record[String, Any]): MessageStreamInfoExportStatuses
    
    /* static member */
    var typesMap: TypesMap
    
    /* static member */
    var validationsMap: ValidationsMap
  }
  object TypeofMessageStreamInfoEx {
    
    inline def apply(
      formatsMap: Record[String, scala.Nothing],
      fromMap: Record[String, Any] => MessageStreamInfoExportStatuses,
      typesMap: TypesMap,
      validationsMap: ValidationsMap
    ): TypeofMessageStreamInfoEx = {
      val __obj = js.Dynamic.literal(formatsMap = formatsMap.asInstanceOf[js.Any], fromMap = js.Any.fromFunction1(fromMap), typesMap = typesMap.asInstanceOf[js.Any], validationsMap = validationsMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMessageStreamInfoEx]
    }
    
    extension [Self <: TypeofMessageStreamInfoEx](x: Self) {
      
      inline def setFormatsMap(value: Record[String, scala.Nothing]): Self = StObject.set(x, "formatsMap", value.asInstanceOf[js.Any])
      
      inline def setFromMap(value: Record[String, Any] => MessageStreamInfoExportStatuses): Self = StObject.set(x, "fromMap", js.Any.fromFunction1(value))
      
      inline def setTypesMap(value: TypesMap): Self = StObject.set(x, "typesMap", value.asInstanceOf[js.Any])
      
      inline def setValidationsMap(value: ValidationsMap): Self = StObject.set(x, "validationsMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofMessageStreamInfoSt extends StObject {
    
    /* static member */
    var formatsMap: Record[String, scala.Nothing]
    
    /* static member */
    def fromMap(d: Record[String, Any]): MessageStreamInfoStorageStatus
    
    /* static member */
    var typesMap: TypesMap
    
    /* static member */
    var validationsMap: ValidationsMap
  }
  object TypeofMessageStreamInfoSt {
    
    inline def apply(
      formatsMap: Record[String, scala.Nothing],
      fromMap: Record[String, Any] => MessageStreamInfoStorageStatus,
      typesMap: TypesMap,
      validationsMap: ValidationsMap
    ): TypeofMessageStreamInfoSt = {
      val __obj = js.Dynamic.literal(formatsMap = formatsMap.asInstanceOf[js.Any], fromMap = js.Any.fromFunction1(fromMap), typesMap = typesMap.asInstanceOf[js.Any], validationsMap = validationsMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMessageStreamInfoSt]
    }
    
    extension [Self <: TypeofMessageStreamInfoSt](x: Self) {
      
      inline def setFormatsMap(value: Record[String, scala.Nothing]): Self = StObject.set(x, "formatsMap", value.asInstanceOf[js.Any])
      
      inline def setFromMap(value: Record[String, Any] => MessageStreamInfoStorageStatus): Self = StObject.set(x, "fromMap", js.Any.fromFunction1(value))
      
      inline def setTypesMap(value: TypesMap): Self = StObject.set(x, "typesMap", value.asInstanceOf[js.Any])
      
      inline def setValidationsMap(value: ValidationsMap): Self = StObject.set(x, "validationsMap", value.asInstanceOf[js.Any])
    }
  }
}
