package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "Persistence")
@js.native
open class Persistence () extends StObject {
  def this(value: PersistenceValue) = this()
  
  def asMap(): PersistenceMap = js.native
}
/* static members */
object Persistence {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Persistence")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Persistence.File")
  @js.native
  def File: Persistence = js.native
  inline def File_=(x: Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Persistence.Memory")
  @js.native
  def Memory: Persistence = js.native
  inline def Memory_=(x: Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Memory")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: PersistenceMap): Persistence = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[Persistence]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Persistence.options")
  @js.native
  def options: PersistenceOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Persistence.optionsFlipped")
  @js.native
  def optionsFlipped: PersistenceOptionsFlipped = js.native
  inline def optionsFlipped_=(x: PersistenceOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: PersistenceOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
