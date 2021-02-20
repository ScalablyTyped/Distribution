package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMeshesOutput extends StObject {
  
  /**
    * The list of existing service meshes.
    */
  var meshes: MeshList = js.native
  
  /**
    * The nextToken value to include in a future ListMeshes request. When the results of a ListMeshes request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListMeshesOutput {
  
  @scala.inline
  def apply(meshes: MeshList): ListMeshesOutput = {
    val __obj = js.Dynamic.literal(meshes = meshes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMeshesOutput]
  }
  
  @scala.inline
  implicit class ListMeshesOutputMutableBuilder[Self <: ListMeshesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshes(value: MeshList): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshesVarargs(value: MeshRef*): Self = StObject.set(x, "meshes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
