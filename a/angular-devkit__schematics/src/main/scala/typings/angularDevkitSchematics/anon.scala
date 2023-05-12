package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.logging.Logger
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.srcWorkflowInterfaceMod.WorkflowExecutionContext
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Collection[CollectionMetadataT /* <: js.Object */] extends StObject {
    
    val collection: typings.angularDevkitSchematics.srcEngineInterfaceMod.CollectionDescription[CollectionMetadataT]
    
    val hidden: js.UndefOr[Boolean] = js.undefined
    
    val name: String
    
    val `private`: js.UndefOr[Boolean] = js.undefined
  }
  object Collection {
    
    inline def apply[CollectionMetadataT /* <: js.Object */](
      collection: typings.angularDevkitSchematics.srcEngineInterfaceMod.CollectionDescription[CollectionMetadataT],
      name: String
    ): Collection[CollectionMetadataT] = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection[CollectionMetadataT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collection[?], CollectionMetadataT /* <: js.Object */] (val x: Self & Collection[CollectionMetadataT]) extends AnyVal {
      
      inline def setCollection(
        value: typings.angularDevkitSchematics.srcEngineInterfaceMod.CollectionDescription[CollectionMetadataT]
      ): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
  
  /* Inlined @angular-devkit/schematics.@angular-devkit/schematics/src/engine/interface.CollectionDescription<{}> */
  trait CollectionDescription extends StObject {
    
    val `extends`: js.UndefOr[js.Array[String]] = js.undefined
    
    val name: String
  }
  object CollectionDescription {
    
    inline def apply(name: String): CollectionDescription = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionDescription] (val x: Self) extends AnyVal {
      
      inline def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extends extends StObject {
    
    val `extends`: js.UndefOr[js.Array[String]] = js.undefined
    
    val name: String
  }
  object Extends {
    
    inline def apply(name: String): Extends = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extends]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extends] (val x: Self) extends AnyVal {
      
      inline def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@angular-devkit/schematics.@angular-devkit/schematics/src/engine/interface.ExecutionOptions> */
  trait PartialExecutionOptions extends StObject {
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object PartialExecutionOptions {
    
    inline def apply(): PartialExecutionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialExecutionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialExecutionOptions] (val x: Self) extends AnyVal {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@angular-devkit/schematics.@angular-devkit/schematics/src/workflow/interface.WorkflowExecutionContext> & @angular-devkit/schematics.@angular-devkit/schematics/src/workflow/interface.RequiredWorkflowExecutionContext */
  trait PartialWorkflowExecutionC extends StObject {
    
    var allowPrivate: js.UndefOr[Boolean] = js.undefined
    
    var collection: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var parentContext: js.UndefOr[ReadonlyWorkflowExecution] = js.undefined
    
    var schematic: js.UndefOr[String] = js.undefined
  }
  object PartialWorkflowExecutionC {
    
    inline def apply(): PartialWorkflowExecutionC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWorkflowExecutionC]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialWorkflowExecutionC] (val x: Self) extends AnyVal {
      
      inline def setAllowPrivate(value: Boolean): Self = StObject.set(x, "allowPrivate", value.asInstanceOf[js.Any])
      
      inline def setAllowPrivateUndefined: Self = StObject.set(x, "allowPrivate", js.undefined)
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParentContext(value: ReadonlyWorkflowExecution): Self = StObject.set(x, "parentContext", value.asInstanceOf[js.Any])
      
      inline def setParentContextUndefined: Self = StObject.set(x, "parentContext", js.undefined)
      
      inline def setSchematic(value: String): Self = StObject.set(x, "schematic", value.asInstanceOf[js.Any])
      
      inline def setSchematicUndefined: Self = StObject.set(x, "schematic", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@angular-devkit/schematics.@angular-devkit/schematics/src/tree/interface.FileEntry> */
  trait ReadonlyFileEntry extends StObject {
    
    val content: Buffer
    
    val path: Path_
  }
  object ReadonlyFileEntry {
    
    inline def apply(content: Buffer, path: Path_): ReadonlyFileEntry = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyFileEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyFileEntry] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@angular-devkit/schematics.@angular-devkit/schematics/src/workflow/interface.WorkflowExecutionContext> */
  trait ReadonlyWorkflowExecution extends StObject {
    
    val allowPrivate: js.UndefOr[Boolean] = js.undefined
    
    val collection: String
    
    val debug: Boolean
    
    val logger: Logger
    
    val options: js.Object
    
    val parentContext: js.UndefOr[WorkflowExecutionContext] = js.undefined
    
    val schematic: String
  }
  object ReadonlyWorkflowExecution {
    
    inline def apply(collection: String, debug: Boolean, logger: Logger, options: js.Object, schematic: String): ReadonlyWorkflowExecution = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], schematic = schematic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyWorkflowExecution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyWorkflowExecution] (val x: Self) extends AnyVal {
      
      inline def setAllowPrivate(value: Boolean): Self = StObject.set(x, "allowPrivate", value.asInstanceOf[js.Any])
      
      inline def setAllowPrivateUndefined: Self = StObject.set(x, "allowPrivate", js.undefined)
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParentContext(value: WorkflowExecutionContext): Self = StObject.set(x, "parentContext", value.asInstanceOf[js.Any])
      
      inline def setParentContextUndefined: Self = StObject.set(x, "parentContext", js.undefined)
      
      inline def setSchematic(value: String): Self = StObject.set(x, "schematic", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @angular-devkit/schematics.@angular-devkit/schematics/src/engine/interface.SchematicDescription<{}, {}> */
  trait SchematicDescription extends StObject {
    
    val collection: CollectionDescription
    
    val hidden: js.UndefOr[Boolean] = js.undefined
    
    val name: String
    
    val `private`: js.UndefOr[Boolean] = js.undefined
  }
  object SchematicDescription {
    
    inline def apply(collection: CollectionDescription, name: String): SchematicDescription = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchematicDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchematicDescription] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: CollectionDescription): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
}
