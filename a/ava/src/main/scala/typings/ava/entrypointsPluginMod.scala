package typings.ava

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entrypointsPluginMod {
  
  @JSImport("ava/entrypoints/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerSharedWorker[Data](
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SharedWorker.Plugin.RegistrationOptions<'ava-4', Data> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSharedWorker")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
