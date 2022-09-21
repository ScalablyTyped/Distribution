package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.dataMod.PersistenceMap
import typings.awsGreengrassCoreSdk.dataMod.PersistenceOptions
import typings.awsGreengrassCoreSdk.dataMod.PersistenceOptionsFlipped
import typings.awsGreengrassCoreSdk.dataMod.PersistenceValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence")
@js.native
open class Persistence ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.Persistence {
  def this(value: PersistenceValue) = this()
}
/* static members */
object Persistence {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.File")
  @js.native
  def File: typings.awsGreengrassCoreSdk.dataMod.Persistence = js.native
  inline def File_=(x: typings.awsGreengrassCoreSdk.dataMod.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.Memory")
  @js.native
  def Memory: typings.awsGreengrassCoreSdk.dataMod.Persistence = js.native
  inline def Memory_=(x: typings.awsGreengrassCoreSdk.dataMod.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Memory")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: PersistenceMap): typings.awsGreengrassCoreSdk.dataMod.Persistence = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.Persistence]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.options")
  @js.native
  def options: PersistenceOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.optionsFlipped")
  @js.native
  def optionsFlipped: PersistenceOptionsFlipped = js.native
  inline def optionsFlipped_=(x: PersistenceOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: PersistenceOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
