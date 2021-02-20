package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.anon.Active
import typings.atlassianCrowdClient.atlassianCrowdClientStrings.GROUP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
  @js.native
  class ^ protected () extends Group {
    def this(groupname: String) = this()
    def this(groupname: String, description: String) = this()
    def this(groupname: String, description: js.UndefOr[scala.Nothing], active: Boolean) = this()
    def this(groupname: String, description: String, active: Boolean) = this()
    def this(
      groupname: String,
      description: js.UndefOr[scala.Nothing],
      active: js.UndefOr[scala.Nothing],
      attributes: js.Any
    ) = this()
    def this(groupname: String, description: js.UndefOr[scala.Nothing], active: Boolean, attributes: js.Any) = this()
    def this(groupname: String, description: String, active: js.UndefOr[scala.Nothing], attributes: js.Any) = this()
    def this(groupname: String, description: String, active: Boolean, attributes: js.Any) = this()
  }
  
  /* static member */
  @JSImport("atlassian-crowd-client/lib/models/group", "fromCrowd")
  @js.native
  def fromCrowd(obj: Active): Group = js.native
  
  @js.native
  trait Group extends StObject {
    
    val active: Boolean = js.native
    
    val attributes: js.UndefOr[js.Any] = js.native
    
    val description: String = js.native
    
    val groupname: String = js.native
    
    def toCrowd(): GroupObj = js.native
  }
  object Group {
    
    @scala.inline
    def apply(active: Boolean, description: String, groupname: String, toCrowd: () => GroupObj): Group = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupname = groupname.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd))
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupname(value: String): Self = StObject.set(x, "groupname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToCrowd(value: () => GroupObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait GroupObj extends StObject {
    
    val active: Boolean = js.native
    
    val description: String = js.native
    
    val name: String = js.native
    
    val `type`: GROUP = js.native
  }
  object GroupObj {
    
    @scala.inline
    def apply(active: Boolean, description: String, name: String, `type`: GROUP): GroupObj = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupObj]
    }
    
    @scala.inline
    implicit class GroupObjMutableBuilder[Self <: GroupObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: GROUP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
