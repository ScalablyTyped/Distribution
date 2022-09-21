package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a channel the block appears in
  */
/* Inlined parent std.Partial<are.na.are.na.Channel> */
trait Connection extends StObject {
  
  var added_to_at: js.UndefOr[Timestamp] = js.undefined
  
  var base_class: js.UndefOr[String] = js.undefined
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var collaboration: js.UndefOr[Boolean] = js.undefined
  
  var collaborators: js.UndefOr[js.Array[User] | Null] = js.undefined
  
  var contents: js.UndefOr[js.Array[Block] | Null] = js.undefined
  
  var created_at: js.UndefOr[Timestamp] = js.undefined
  
  var current_page: js.UndefOr[Double] = js.undefined
  
  var follower_count: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var kind: js.UndefOr[ChannelKind] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var per: js.UndefOr[Double] = js.undefined
  
  var published: js.UndefOr[Boolean] = js.undefined
  
  var slug: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[ChannelStatus] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var total_pages: js.UndefOr[Double] = js.undefined
  
  var updated_at: js.UndefOr[Timestamp] = js.undefined
  
  var user: js.UndefOr[User] = js.undefined
  
  var user_id: js.UndefOr[Double] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setAdded_to_at(value: Timestamp): Self = StObject.set(x, "added_to_at", value.asInstanceOf[js.Any])
    
    inline def setAdded_to_atUndefined: Self = StObject.set(x, "added_to_at", js.undefined)
    
    inline def setBase_class(value: String): Self = StObject.set(x, "base_class", value.asInstanceOf[js.Any])
    
    inline def setBase_classUndefined: Self = StObject.set(x, "base_class", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setCollaboration(value: Boolean): Self = StObject.set(x, "collaboration", value.asInstanceOf[js.Any])
    
    inline def setCollaborationUndefined: Self = StObject.set(x, "collaboration", js.undefined)
    
    inline def setCollaborators(value: js.Array[User]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsNull: Self = StObject.set(x, "collaborators", null)
    
    inline def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
    
    inline def setCollaboratorsVarargs(value: User*): Self = StObject.set(x, "collaborators", js.Array(value*))
    
    inline def setContents(value: js.Array[Block]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setContentsVarargs(value: Block*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
    
    inline def setCurrent_pageUndefined: Self = StObject.set(x, "current_page", js.undefined)
    
    inline def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
    
    inline def setFollower_countUndefined: Self = StObject.set(x, "follower_count", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: ChannelKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPer(value: Double): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    
    inline def setTotal_pagesUndefined: Self = StObject.set(x, "total_pages", js.undefined)
    
    inline def setUpdated_at(value: Timestamp): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
