package typings.areNa

import typings.areNa.mod.Block
import typings.areNa.mod.Channel
import typings.areNa.mod.ChannelStatus
import typings.areNa.mod.CustomRequestHandler
import typings.areNa.mod.Group
import typings.areNa.mod.PaginationParams
import typings.areNa.mod.Params
import typings.areNa.mod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var authToken: js.UndefOr[String] = js.undefined
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var requestHandler: js.UndefOr[CustomRequestHandler] = js.undefined
  }
  object AccessToken {
    
    inline def apply(): AccessToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessToken]
    }
    
    extension [Self <: AccessToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setRequestHandler(value: CustomRequestHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRequestHandlerUndefined: Self = StObject.set(x, "requestHandler", js.undefined)
    }
  }
  
  @js.native
  trait AddCollaborators extends StObject {
    
    def addCollaborators(userIDs: String*): js.Promise[js.Array[User]] = js.native
    /**
      * Add collaborators to a channel. Pass userIds as an Array or multiple arguments.
      */
    def addCollaborators(userIDs: js.Array[String]): js.Promise[js.Array[User]] = js.native
    
    /**
      * Get all of the channels connected to blocks in the channel. Supports pagination.
      */
    def channels(): js.Promise[js.Array[Channel]] = js.native
    def channels(params: PaginationParams): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Get the channel's collaborators. Supports pagination.
      */
    def collaborators(): js.Promise[js.Array[User]] = js.native
    def collaborators(params: PaginationParams): js.Promise[js.Array[User]] = js.native
    
    /**
      * Get all of the connections of the channel (channels where this channel is connected). Supports pagination.
      */
    def connections(): js.Promise[Any] = js.native
    def connections(params: PaginationParams): js.Promise[Any] = js.native
    
    /**
      * Get the channel's contents only, as an array. Supports pagination.
      */
    def contents(): js.Promise[js.Array[Block]] = js.native
    def contents(params: PaginationParams): js.Promise[js.Array[Block]] = js.native
    
    /**
      * Creates a new channel. Called as channel(title).create(status). Title is required, status is optional.
      */
    def create(status: ChannelStatus): js.Promise[Unit] = js.native
    /**
      * Creates a new channel. Called as or channel().create(title, status). Title is required, status is optional.
      */
    def create(title: String, status: ChannelStatus): js.Promise[Unit] = js.native
    
    /**
      * Create a block and add it to the channel. Specify textual content or a source link.
      */
    def createBlock(content: Any): js.Promise[Block] = js.native
    
    /**
      * Delete the channel. Can be called as channel(slug).delete() or channel().delete(slug).
      */
    def delete(slug: String): js.Promise[Unit] = js.native
    
    /**
      * Remove a block from the channel
      */
    def deleteBlock(blockID: String): js.Promise[Unit] = js.native
    
    /**
      * Remove collaborators from a channel. Accepts userIds in the same format as addCollaborators.
      */
    def deleteCollaborators(userIDs: js.Array[String]): js.Promise[js.Array[User]] = js.native
    
    /**
      * Get the channel as an Object. Gets a list of public channels if slug/id not specified. Supports pagination.
      */
    def get(): js.Promise[Channel] = js.native
    def get(params: PaginationParams): js.Promise[Channel] = js.native
    
    /**
      * Limited view of the channel
      */
    def thumb(): js.Promise[Channel] = js.native
    def thumb(params: Params): js.Promise[Channel] = js.native
    
    /**
      * Update the channel's attributes. params should be an object and can include title and/or status.
      * Currently it appears that the are.na API requires both values.
      * If title is not set, an error will occur.
      * If status is not set, it will default to "public".
      */
    def update(params: Status): js.Promise[Channel] = js.native
  }
  
  @js.native
  trait All extends StObject {
    
    /**
      * Search for channels, blocks, and users matching query.
      */
    def all(): js.Promise[Blocks] = js.native
    def all(params: Params): js.Promise[Blocks] = js.native
    
    /**
      * Search for blocks.
      */
    def blocks(params: Params): js.Promise[js.Array[Block]] = js.native
    
    /**
      * Search for channels.
      */
    def channels(params: Params): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Search for users.
      */
    def users(params: Params): js.Promise[js.Array[User]] = js.native
  }
  
  trait Blocks extends StObject {
    
    var blocks: js.UndefOr[js.Array[Block]] = js.undefined
    
    var channels: js.UndefOr[js.Array[Channel]] = js.undefined
    
    var users: js.UndefOr[js.Array[User]] = js.undefined
  }
  object Blocks {
    
    inline def apply(): Blocks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blocks]
    }
    
    extension [Self <: Blocks](x: Self) {
      
      inline def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  @js.native
  trait Channels extends StObject {
    
    /**
      * Get a group's channels, as an array. Supports pagination.
      */
    def channels(): js.Promise[js.Array[Channel]] = js.native
    def channels(params: PaginationParams): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Get the group as an Object.
      */
    def get(): js.Promise[Group] = js.native
    def get(params: PaginationParams): js.Promise[Group] = js.native
  }
  
  trait Content extends StObject {
    
    var content: js.UndefOr[Any] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    /**
      * Get a list of the channels a block belongs to
      */
    def channels(): js.Promise[js.Array[Channel]] = js.native
    def channels(params: Params): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Create a block and add it to the channel.
      * Specify textual content or a source link.
      */
    def create(channelSlug: String, content: Any): js.Promise[Channel] = js.native
    
    /**
      * Get the block specified by id
      */
    def get(): js.Promise[Block] = js.native
    def get(params: Params): js.Promise[Block] = js.native
    
    /**
      * Update a block. Pass an object with one or more of content,
      * title or description fields to update those fields.
      */
    def update(params: Content): js.Promise[Unit] = js.native
  }
  
  trait Filesize extends StObject {
    
    var file_size: Double
    
    var file_size_display: String
    
    var url: String
  }
  object Filesize {
    
    inline def apply(file_size: Double, file_size_display: String, url: String): Filesize = {
      val __obj = js.Dynamic.literal(file_size = file_size.asInstanceOf[js.Any], file_size_display = file_size_display.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filesize]
    }
    
    extension [Self <: Filesize](x: Self) {
      
      inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
      
      inline def setFile_size_display(value: String): Self = StObject.set(x, "file_size_display", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Followers extends StObject {
    
    /**
      * Get a user's channels, as an array. Supports pagination.
      */
    def channels(): js.Promise[js.Array[Channel]] = js.native
    def channels(params: PaginationParams): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Get a list of the user's followers. Supports pagination.
      */
    def followers(): js.Promise[js.Array[User]] = js.native
    def followers(params: PaginationParams): js.Promise[js.Array[User]] = js.native
    
    /**
      * Get a list of users and/or blocks the user is following. Supports pagination.
      */
    def following(): js.Promise[js.Array[Block | User]] = js.native
    def following(params: PaginationParams): js.Promise[js.Array[Block | User]] = js.native
    
    /**
      * Get a user specified by id
      */
    def get(): js.Promise[User] = js.native
    def get(params: Params): js.Promise[User] = js.native
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Status extends StObject {
    
    var status: js.UndefOr[ChannelStatus] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Status {
    
    inline def apply(): Status = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Status]
    }
    
    extension [Self <: Status](x: Self) {
      
      inline def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
