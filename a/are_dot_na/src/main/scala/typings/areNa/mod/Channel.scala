package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Channels are organizational structures for content. This means blocks but also sometimes other channels.
  * Channels have a primary user (indicated by the user_id) but can also have collaborators (an array of users).
  * Channels can be public (anyone can view and add),
  * closed (only the channel's author and collaborators can add but everyone can view)
  * and private (only the channels authors and collaborators can view and add).
  */
trait Channel extends StObject {
  
  /**
    * Will always be "Channel"
    */
  var base_class: String
  
  /**
    * Will always be "Channel"
    */
  var `class`: String
  
  /**
    * If the channel has collaborators or not
    */
  var collaboration: Boolean
  
  /**
    * Collaborators on the channel
    */
  var collaborators: js.Array[User] | Null
  
  /**
    * Array of blocks and other channels in the channel.
    * Note: If the request is authenticated, this will include any private channels included in the requested
    * channel that you have access to. If not, only public channels included in the requested channel will be shown.
    */
  var contents: js.Array[Block] | Null
  
  /**
    * Date when the channel was created
    */
  var created_at: Timestamp
  
  /**
    * If pagination is used, page requested
    */
  var current_page: Double
  
  /**
    * Number of followers the channel has
    */
  var follower_count: Double
  
  /**
    * The internal ID of the channel
    */
  var id: Double
  
  /**
    * Can be either "default" (a standard channel) or "profile" the default channel of a user
    */
  var kind: ChannelKind
  
  /**
    * The number of items in a channel (blocks and other channels)
    */
  var length: Double
  
  /**
    * If channel is open to other members of arena for adding blocks
    */
  var open: Boolean
  
  /**
    * If pagination is used, items per page requested
    */
  var per: Double
  
  /**
    * If channel is visible to all members of arena or not
    */
  var published: Boolean
  
  /**
    * The slug of the channel used in the url (e.g. http:re.na/arena-influences)
    */
  var slug: String
  
  /**
    * Can be "private" (only open for reading and adding to the channel by channel author and collaborators),
    * "closed" (open for reading by everyone, only channel author and collaborators can add)
    * or "public" (everyone can read and add to the channel)
    */
  var status: ChannelStatus
  
  /**
    * The title of the channel
    */
  var title: String
  
  /**
    * If pagination is used, how many total pages there are in your request
    */
  var total_pages: Double
  
  /**
    * Date when the channel was last updated
    */
  var updated_at: Timestamp
  
  /**
    * More information on the channel author.
    */
  var user: User
  
  /**
    * Internal ID of the channel author
    */
  var user_id: Double
}
object Channel {
  
  inline def apply(
    base_class: String,
    `class`: String,
    collaboration: Boolean,
    created_at: Timestamp,
    current_page: Double,
    follower_count: Double,
    id: Double,
    kind: ChannelKind,
    length: Double,
    open: Boolean,
    per: Double,
    published: Boolean,
    slug: String,
    status: ChannelStatus,
    title: String,
    total_pages: Double,
    updated_at: Timestamp,
    user: User,
    user_id: Double
  ): Channel = {
    val __obj = js.Dynamic.literal(base_class = base_class.asInstanceOf[js.Any], collaboration = collaboration.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], current_page = current_page.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], collaborators = null, contents = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setBase_class(value: String): Self = StObject.set(x, "base_class", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setCollaboration(value: Boolean): Self = StObject.set(x, "collaboration", value.asInstanceOf[js.Any])
    
    inline def setCollaborators(value: js.Array[User]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsNull: Self = StObject.set(x, "collaborators", null)
    
    inline def setCollaboratorsVarargs(value: User*): Self = StObject.set(x, "collaborators", js.Array(value*))
    
    inline def setContents(value: js.Array[Block]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsVarargs(value: Block*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
    
    inline def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ChannelKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setPer(value: Double): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: Timestamp): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
