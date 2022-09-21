package typings.agilite

import typings.agilite.agiliteInterfaceMod.ConfigInterface
import typings.agilite.utilsInterfaceMod.OutputFormatInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controllerSolutionsMod {
  
  @JSImport("agilite/dist/modules/admin/controller-solutions", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AdminSolutions {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait AdminSolutions extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var outputFormat: OutputFormatInterface = js.native
    
    def postData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def putData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
}
