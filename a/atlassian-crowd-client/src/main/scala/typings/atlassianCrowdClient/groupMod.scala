package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.anon.Active
import typings.atlassianCrowdClient.atlassianCrowdClientStrings.GROUP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Group {
    def this(groupname: String) = this()
    def this(groupname: String, description: String) = this()
    def this(groupname: String, description: String, active: Boolean) = this()
    def this(groupname: String, description: Unit, active: Boolean) = this()
    def this(groupname: String, description: String, active: Boolean, attributes: js.Any) = this()
    def this(groupname: String, description: String, active: Unit, attributes: js.Any) = this()
    def this(groupname: String, description: Unit, active: Boolean, attributes: js.Any) = this()
    def this(groupname: String, description: Unit, active: Unit, attributes: js.Any) = this()
    
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
  @scala.inline
  def fromCrowd(obj: Active): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(obj.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  trait Group extends StObject {
    
    val active: Boolean
    
    val attributes: js.UndefOr[js.Any] = js.undefined
    
    val description: String
    
    val groupname: String
    
    def toCrowd(): GroupObj
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
  
  trait GroupObj extends StObject {
    
    val active: Boolean
    
    val description: String
    
    val name: String
    
    val `type`: GROUP
  }
  object GroupObj {
    
    @scala.inline
    def apply(active: Boolean, description: String, name: String): GroupObj = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GROUP")
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
