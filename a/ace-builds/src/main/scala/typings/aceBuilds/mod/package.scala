package typings.aceBuilds.mod

import typings.aceBuilds.anon.PartialEditorOptions
import typings.aceBuilds.mod.Ace.Config
import typings.aceBuilds.mod.Ace.Document
import typings.aceBuilds.mod.Ace.Editor
import typings.aceBuilds.mod.Ace.SyntaxMode
import typings.aceBuilds.mod.^
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def config: Config = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[Config]

inline def createEditSession(text: String, mode: SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.EditSession]
inline def createEditSession(text: Document, mode: SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.aceBuilds.mod.Ace.EditSession]

inline def edit(el: String): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[Editor]
inline def edit(el: String, options: PartialEditorOptions): Editor = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]
inline def edit(el: Element): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[Editor]
inline def edit(el: Element, options: PartialEditorOptions): Editor = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]

inline def require(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
