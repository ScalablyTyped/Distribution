package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationJobSummary extends StObject {
  
  /**
    * The time when the model compilation job completed.
    */
  var CompilationEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: typings.awsSdk.clientsSagemakerMod.CompilationJobArn
  
  /**
    * The name of the model compilation job that you want a summary for.
    */
  var CompilationJobName: EntityName
  
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typings.awsSdk.clientsSagemakerMod.CompilationJobStatus
  
  /**
    * The time when the model compilation job started.
    */
  var CompilationStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of device that the model will run on after the compilation job has completed.
    */
  var CompilationTargetDevice: js.UndefOr[TargetDevice] = js.undefined
  
  /**
    * The type of accelerator that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformAccelerator: js.UndefOr[TargetPlatformAccelerator] = js.undefined
  
  /**
    * The type of architecture that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformArch: js.UndefOr[TargetPlatformArch] = js.undefined
  
  /**
    * The type of OS that the model will run on after the compilation job has completed.
    */
  var CompilationTargetPlatformOs: js.UndefOr[TargetPlatformOs] = js.undefined
  
  /**
    * The time when the model compilation job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The time when the model compilation job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object CompilationJobSummary {
  
  inline def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CreationTime: js.Date
  ): CompilationJobSummary = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilationJobSummary] (val x: Self) extends AnyVal {
    
    inline def setCompilationEndTime(value: js.Date): Self = StObject.set(x, "CompilationEndTime", value.asInstanceOf[js.Any])
    
    inline def setCompilationEndTimeUndefined: Self = StObject.set(x, "CompilationEndTime", js.undefined)
    
    inline def setCompilationJobArn(value: CompilationJobArn): Self = StObject.set(x, "CompilationJobArn", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobStatus(value: CompilationJobStatus): Self = StObject.set(x, "CompilationJobStatus", value.asInstanceOf[js.Any])
    
    inline def setCompilationStartTime(value: js.Date): Self = StObject.set(x, "CompilationStartTime", value.asInstanceOf[js.Any])
    
    inline def setCompilationStartTimeUndefined: Self = StObject.set(x, "CompilationStartTime", js.undefined)
    
    inline def setCompilationTargetDevice(value: TargetDevice): Self = StObject.set(x, "CompilationTargetDevice", value.asInstanceOf[js.Any])
    
    inline def setCompilationTargetDeviceUndefined: Self = StObject.set(x, "CompilationTargetDevice", js.undefined)
    
    inline def setCompilationTargetPlatformAccelerator(value: TargetPlatformAccelerator): Self = StObject.set(x, "CompilationTargetPlatformAccelerator", value.asInstanceOf[js.Any])
    
    inline def setCompilationTargetPlatformAcceleratorUndefined: Self = StObject.set(x, "CompilationTargetPlatformAccelerator", js.undefined)
    
    inline def setCompilationTargetPlatformArch(value: TargetPlatformArch): Self = StObject.set(x, "CompilationTargetPlatformArch", value.asInstanceOf[js.Any])
    
    inline def setCompilationTargetPlatformArchUndefined: Self = StObject.set(x, "CompilationTargetPlatformArch", js.undefined)
    
    inline def setCompilationTargetPlatformOs(value: TargetPlatformOs): Self = StObject.set(x, "CompilationTargetPlatformOs", value.asInstanceOf[js.Any])
    
    inline def setCompilationTargetPlatformOsUndefined: Self = StObject.set(x, "CompilationTargetPlatformOs", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
