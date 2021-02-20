package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileAssociationMod {
  
  @js.native
  trait FileAssociation extends StObject {
    
    /**
      * *windows-only.* The description.
      */
    val description: js.UndefOr[String | Null] = js.native
    
    /**
      * The extension (minus the leading period). e.g. `png`.
      */
    val ext: String | js.Array[String] = js.native
    
    /**
      * The path to icon (`.icns` for MacOS and `.ico` for Windows), relative to `build` (build resources directory). Defaults to `${firstExt}.icns`/`${firstExt}.ico` (if several extensions specified, first is used) or to application icon.
      *
      * Not supported on Linux, file issue if need (default icon will be `x-office-document`).
      */
    val icon: js.UndefOr[String | Null] = js.native
    
    /**
      * *macOS-only* Whether the document is distributed as a bundle. If set to true, the bundle directory is treated as a file. Corresponds to `LSTypeIsPackage`.
      */
    val isPackage: js.UndefOr[Boolean] = js.native
    
    /**
      * *linux-only.* The mime-type.
      */
    val mimeType: js.UndefOr[String | Null] = js.native
    
    /**
      * The name. e.g. `PNG`. Defaults to `ext`.
      */
    val name: js.UndefOr[String | Null] = js.native
    
    /**
      * *macOS-only* The app’s rank with respect to the type. The value can be `Owner`, `Default`, `Alternate`, or `None`. Corresponds to `LSHandlerRank`.
      * @default Default
      */
    val rank: js.UndefOr[String] = js.native
    
    /**
      * *macOS-only* The app’s role with respect to the type. The value can be `Editor`, `Viewer`, `Shell`, or `None`. Corresponds to `CFBundleTypeRole`.
      * @default Editor
      */
    val role: js.UndefOr[String] = js.native
  }
  object FileAssociation {
    
    @scala.inline
    def apply(ext: String | js.Array[String]): FileAssociation = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileAssociation]
    }
    
    @scala.inline
    implicit class FileAssociationMutableBuilder[Self <: FileAssociation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExt(value: String | js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsPackage(value: Boolean): Self = StObject.set(x, "isPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPackageUndefined: Self = StObject.set(x, "isPackage", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
