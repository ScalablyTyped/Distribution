package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksContainerSecurityContext extends StObject {
  
  /**
    * When this parameter is true, the container is given elevated permissions on the host container instance. The level of permissions are similar to the root user permissions. The default value is false. This parameter maps to privileged policy in the Privileged pod security policies in the Kubernetes documentation.
    */
  var privileged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this parameter is true, the container is given read-only access to its root file system. The default value is false. This parameter maps to ReadOnlyRootFilesystem policy in the Volumes and file systems pod security policies in the Kubernetes documentation.
    */
  var readOnlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this parameter is specified, the container is run as the specified group ID (gid). If this parameter isn't specified, the default is the group that's specified in the image metadata. This parameter maps to RunAsGroup and MustRunAs policy in the Users and groups pod security policies in the Kubernetes documentation.
    */
  var runAsGroup: js.UndefOr[Long] = js.undefined
  
  /**
    * When this parameter is specified, the container is run as a user with a uid other than 0. If this parameter isn't specified, so such rule is enforced. This parameter maps to RunAsUser and MustRunAsNonRoot policy in the Users and groups pod security policies in the Kubernetes documentation.
    */
  var runAsNonRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this parameter is specified, the container is run as the specified user ID (uid). If this parameter isn't specified, the default is the user that's specified in the image metadata. This parameter maps to RunAsUser and MustRanAs policy in the Users and groups pod security policies in the Kubernetes documentation.
    */
  var runAsUser: js.UndefOr[Long] = js.undefined
}
object EksContainerSecurityContext {
  
  inline def apply(): EksContainerSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksContainerSecurityContext]
  }
  
  extension [Self <: EksContainerSecurityContext](x: Self) {
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    inline def setReadOnlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyRootFilesystemUndefined: Self = StObject.set(x, "readOnlyRootFilesystem", js.undefined)
    
    inline def setRunAsGroup(value: Long): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    inline def setRunAsGroupUndefined: Self = StObject.set(x, "runAsGroup", js.undefined)
    
    inline def setRunAsNonRoot(value: Boolean): Self = StObject.set(x, "runAsNonRoot", value.asInstanceOf[js.Any])
    
    inline def setRunAsNonRootUndefined: Self = StObject.set(x, "runAsNonRoot", js.undefined)
    
    inline def setRunAsUser(value: Long): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    inline def setRunAsUserUndefined: Self = StObject.set(x, "runAsUser", js.undefined)
  }
}
