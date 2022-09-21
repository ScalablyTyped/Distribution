package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.anon.Active
import typings.atlassianCrowdClient.atlassianCrowdClientStrings.GROUP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Group {
    def this(groupname: String) = this()
    def this(groupname: String, description: String) = this()
    def this(groupname: String, description: String, active: Boolean) = this()
    def this(groupname: String, description: Unit, active: Boolean) = this()
    def this(groupname: String, description: String, active: Boolean, attributes: Any) = this()
    def this(groupname: String, description: String, active: Unit, attributes: Any) = this()
    def this(groupname: String, description: Unit, active: Boolean, attributes: Any) = this()
    def this(groupname: String, description: Unit, active: Unit, attributes: Any) = this()
    
    /* CompleteClass */
    override val active: Boolean = js.native
    
    /* CompleteClass */
    override val description: String = js.native
    
    /* CompleteClass */
    override val groupname: String = js.native
    
    /* CompleteClass */
    override def toCrowd(): GroupObj = js.native
  }
  @JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromCrowd(obj: Active): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(obj.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  trait Group extends StObject {
    
    val active: Boolean
    
    val attributes: js.UndefOr[Any] = js.undefined
    
    val description: String
    
    val groupname: String
    
    def toCrowd(): GroupObj
  }
  object Group {
    
    inline def apply(active: Boolean, description: String, groupname: String, toCrowd: () => GroupObj): Group = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupname = groupname.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd))
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setGroupname(value: String): Self = StObject.set(x, "groupname", value.asInstanceOf[js.Any])
      
      inline def setToCrowd(value: () => GroupObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
    }
  }
  
  trait GroupObj extends StObject {
    
    val active: Boolean
    
    val description: String
    
    val name: String
    
    val `type`: GROUP
  }
  object GroupObj {
    
    inline def apply(active: Boolean, description: String, name: String): GroupObj = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GROUP")
      __obj.asInstanceOf[GroupObj]
    }
    
    extension [Self <: GroupObj](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: GROUP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
