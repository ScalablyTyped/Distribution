package typings.appleMusicApi

import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.AppleMusicApi.Playlist
import typings.appleMusicApi.AppleMusicApi.Preview
import typings.appleMusicApi.AppleMusicApi.Relationship
import typings.appleMusicApi.AppleMusicApi.Song
import typings.appleMusicApi.AppleMusicApi.Station
import typings.appleMusicApi.appleMusicApiStrings.`personal-mix`
import typings.appleMusicApi.appleMusicApiStrings.`user-shared`
import typings.appleMusicApi.appleMusicApiStrings.clean
import typings.appleMusicApi.appleMusicApiStrings.editorial
import typings.appleMusicApi.appleMusicApiStrings.explicit
import typings.appleMusicApi.appleMusicApiStrings.external
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlbumName extends StObject {
    
    var albumName: String = js.native
    
    var artistName: String = js.native
    
    var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
    
    var composerName: js.UndefOr[String] = js.native
    
    var contentRating: js.UndefOr[String] = js.native
    
    var discNumber: Double = js.native
    
    var durationInMillis: Double = js.native
    
    var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
    
    var genreNames: js.Array[String] = js.native
    
    var hasLyrics: Boolean = js.native
    
    var isrc: String = js.native
    
    var movementCount: js.UndefOr[Double] = js.native
    
    var movementName: js.UndefOr[String] = js.native
    
    var movementNumber: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var playParams: js.UndefOr[PlayParameters] = js.native
    
    var previews: js.Array[Preview] = js.native
    
    var releaseDate: String = js.native
    
    var trackNumber: Double = js.native
    
    var url: String = js.native
    
    var workName: js.UndefOr[String] = js.native
  }
  object AlbumName {
    
    @scala.inline
    def apply(
      albumName: String,
      artistName: String,
      discNumber: Double,
      durationInMillis: Double,
      genreNames: js.Array[String],
      hasLyrics: Boolean,
      isrc: String,
      name: String,
      previews: js.Array[Preview],
      releaseDate: String,
      trackNumber: Double,
      url: String
    ): AlbumName = {
      val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], hasLyrics = hasLyrics.asInstanceOf[js.Any], isrc = isrc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlbumName]
    }
    
    @scala.inline
    implicit class AlbumNameMutableBuilder[Self <: AlbumName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      @scala.inline
      def setComposerName(value: String): Self = StObject.set(x, "composerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposerNameUndefined: Self = StObject.set(x, "composerName", js.undefined)
      
      @scala.inline
      def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
      
      @scala.inline
      def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationInMillis(value: Double): Self = StObject.set(x, "durationInMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      @scala.inline
      def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value :_*))
      
      @scala.inline
      def setHasLyrics(value: Boolean): Self = StObject.set(x, "hasLyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsrc(value: String): Self = StObject.set(x, "isrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementCount(value: Double): Self = StObject.set(x, "movementCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementCountUndefined: Self = StObject.set(x, "movementCount", js.undefined)
      
      @scala.inline
      def setMovementName(value: String): Self = StObject.set(x, "movementName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementNameUndefined: Self = StObject.set(x, "movementName", js.undefined)
      
      @scala.inline
      def setMovementNumber(value: String): Self = StObject.set(x, "movementNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementNumberUndefined: Self = StObject.set(x, "movementNumber", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
      
      @scala.inline
      def setPreviews(value: js.Array[Preview]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewsVarargs(value: Preview*): Self = StObject.set(x, "previews", js.Array(value :_*))
      
      @scala.inline
      def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkName(value: String): Self = StObject.set(x, "workName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkNameUndefined: Self = StObject.set(x, "workName", js.undefined)
    }
  }
  
  @js.native
  trait ArtistName extends StObject {
    
    // albumName might not actually be a required attribute of Album.
    // There may be a typo in Apple's documentation, their data doesn't
    // actually return this attribute for the example I picked and the description of the field references music videos, further increasingly the likelihood that it's just a typo):
    var albumName: js.UndefOr[String] = js.native
    
    var artistName: String = js.native
    
    var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
    
    var contentRating: js.UndefOr[clean | explicit] = js.native
    
    var copyright: js.UndefOr[String] = js.native
    
    var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
    
    var genreNames: js.Array[String] = js.native
    
    var isCompilation: Boolean = js.native
    
    var isComplete: Boolean = js.native
    
    var isMasteredForItunes: Boolean = js.native
    
    var isSingle: Boolean = js.native
    
    var name: String = js.native
    
    var playParams: js.UndefOr[PlayParameters] = js.native
    
    var recordLabel: String = js.native
    
    var releaseDate: String = js.native
    
    var trackCount: Double = js.native
    
    var url: String = js.native
  }
  object ArtistName {
    
    @scala.inline
    def apply(
      artistName: String,
      genreNames: js.Array[String],
      isCompilation: Boolean,
      isComplete: Boolean,
      isMasteredForItunes: Boolean,
      isSingle: Boolean,
      name: String,
      recordLabel: String,
      releaseDate: String,
      trackCount: Double,
      url: String
    ): ArtistName = {
      val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordLabel = recordLabel.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtistName]
    }
    
    @scala.inline
    implicit class ArtistNameMutableBuilder[Self <: ArtistName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbumNameUndefined: Self = StObject.set(x, "albumName", js.undefined)
      
      @scala.inline
      def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      @scala.inline
      def setContentRating(value: clean | explicit): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      @scala.inline
      def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value :_*))
      
      @scala.inline
      def setIsCompilation(value: Boolean): Self = StObject.set(x, "isCompilation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMasteredForItunes(value: Boolean): Self = StObject.set(x, "isMasteredForItunes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSingle(value: Boolean): Self = StObject.set(x, "isSingle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
      
      @scala.inline
      def setRecordLabel(value: String): Self = StObject.set(x, "recordLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackCount(value: Double): Self = StObject.set(x, "trackCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Artwork extends StObject {
    
    var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
    
    var curatorName: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
    
    // `isChart` is not currently mentioned in the apple music api documentation:
    var isChart: js.UndefOr[Boolean] = js.native
    
    var lastModifiedDate: String = js.native
    
    var name: String = js.native
    
    var playParams: js.UndefOr[PlayParameters] = js.native
    
    var playlistType: `user-shared` | editorial | external | `personal-mix` = js.native
    
    var url: String = js.native
  }
  object Artwork {
    
    @scala.inline
    def apply(
      lastModifiedDate: String,
      name: String,
      playlistType: `user-shared` | editorial | external | `personal-mix`,
      url: String
    ): Artwork = {
      val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playlistType = playlistType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artwork]
    }
    
    @scala.inline
    implicit class ArtworkMutableBuilder[Self <: Artwork] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      @scala.inline
      def setCuratorName(value: String): Self = StObject.set(x, "curatorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCuratorNameUndefined: Self = StObject.set(x, "curatorName", js.undefined)
      
      @scala.inline
      def setDescription(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIsChart(value: Boolean): Self = StObject.set(x, "isChart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChartUndefined: Self = StObject.set(x, "isChart", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
      
      @scala.inline
      def setPlaylistType(value: `user-shared` | editorial | external | `personal-mix`): Self = StObject.set(x, "playlistType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Curator extends StObject {
    
    var curator: Relationship[typings.appleMusicApi.AppleMusicApi.Curator] = js.native
    
    var tracks: js.UndefOr[Relationship[Song]] = js.native
  }
  object Curator {
    
    @scala.inline
    def apply(curator: Relationship[typings.appleMusicApi.AppleMusicApi.Curator]): Curator = {
      val __obj = js.Dynamic.literal(curator = curator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Curator]
    }
    
    @scala.inline
    implicit class CuratorMutableBuilder[Self <: Curator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurator(value: Relationship[typings.appleMusicApi.AppleMusicApi.Curator]): Self = StObject.set(x, "curator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracks(value: Relationship[Song]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: Station = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: Station): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Station): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorialNotes extends StObject {
    
    var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
    
    var genreNames: js.Array[String] = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  object EditorialNotes {
    
    @scala.inline
    def apply(genreNames: js.Array[String], name: String, url: String): EditorialNotes = {
      val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorialNotes]
    }
    
    @scala.inline
    implicit class EditorialNotesMutableBuilder[Self <: EditorialNotes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      @scala.inline
      def setGenreNames(value: js.Array[String]): Self = StObject.set(x, "genreNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenreNamesVarargs(value: String*): Self = StObject.set(x, "genreNames", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Playlists extends StObject {
    
    var playlists: js.UndefOr[Relationship[Playlist]] = js.native
  }
  object Playlists {
    
    @scala.inline
    def apply(): Playlists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Playlists]
    }
    
    @scala.inline
    implicit class PlaylistsMutableBuilder[Self <: Playlists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaylists(value: Relationship[Playlist]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
    
    var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(name: String, url: String): Url = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      @scala.inline
      def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
