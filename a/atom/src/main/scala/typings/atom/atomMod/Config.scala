package typings.atom.atomMod

import org.scalablytyped.runtime.StringDictionary
import typings.atom.Anon_Always
import typings.atom.Anon_AlwaysNo
import typings.atom.Anon_Atom
import typings.atom.Anon_AtomExperimental
import typings.atom.Anon_Auto
import typings.atom.Anon_AutoHard
import typings.atom.Anon_Default
import typings.atom.Anon_DefaultScopeDescriptor
import typings.atom.Anon_ExcludeSources
import typings.atom.Anon_ExcludeSourcesScope
import typings.atom.Anon_Key
import typings.atom.Anon_KeyScopeDescriptor
import typings.atom.Anon_Limited
import typings.atom.Anon_LimitedNo
import typings.atom.Anon_NewValue
import typings.atom.Anon_NewValueOldValue
import typings.atom.Anon_NewValueOldValueBoolean
import typings.atom.Anon_NewValueOldValueFileEncoding
import typings.atom.Anon_NewValueOldValueInvisibles
import typings.atom.Anon_NewValueOldValueNull
import typings.atom.Anon_NewValueOldValueNumber
import typings.atom.Anon_NewValueOldValueNumberString
import typings.atom.Anon_NewValueOldValueString
import typings.atom.Anon_Scope
import typings.atom.Anon_ScopeDescriptor
import typings.atom.Anon_ScopeDescriptorValue
import typings.atom.Anon_ScopeDescriptorValueFileEncoding
import typings.atom.Anon_ScopeDescriptorValueInvisibles
import typings.atom.Anon_ScopeDescriptorValueNull
import typings.atom.Anon_ScopeDescriptorValueNumber
import typings.atom.Anon_ScopeDescriptorValueNumberString
import typings.atom.Anon_ScopeDescriptorValueString
import typings.atom.Anon_ScopeSelector
import typings.atom.atomStrings.always
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.coreDOTallowPendingPaneItems
import typings.atom.atomStrings.coreDOTaudioBeep
import typings.atom.atomStrings.coreDOTautomaticallyUpdate
import typings.atom.atomStrings.coreDOTcloseDeletedFileTabs
import typings.atom.atomStrings.coreDOTcloseEmptyWindows
import typings.atom.atomStrings.coreDOTcolorProfile
import typings.atom.atomStrings.coreDOTcustomFileTypes
import typings.atom.atomStrings.coreDOTdestroyEmptyPanes
import typings.atom.atomStrings.coreDOTdisabledPackages
import typings.atom.atomStrings.coreDOTexcludeVcsIgnoredPaths
import typings.atom.atomStrings.coreDOTfileEncoding
import typings.atom.atomStrings.coreDOTfileSystemWatcher
import typings.atom.atomStrings.coreDOTfollowSymlinks
import typings.atom.atomStrings.coreDOTignoredNames
import typings.atom.atomStrings.coreDOTopenEmptyEditorOnStart
import typings.atom.atomStrings.coreDOTreopenProjectMenuCount
import typings.atom.atomStrings.coreDOTrestorePreviousWindowsOnStart
import typings.atom.atomStrings.coreDOTtelemetryConsent
import typings.atom.atomStrings.coreDOTthemes
import typings.atom.atomStrings.coreDOTuseProxySettingsWhenCallingApm
import typings.atom.atomStrings.coreDOTuseTreeSitterParsers
import typings.atom.atomStrings.coreDOTversionPinnedPackages
import typings.atom.atomStrings.coreDOTwarnOnLargeFileLimit
import typings.atom.atomStrings.default
import typings.atom.atomStrings.editorDOTatomicSoftTabs
import typings.atom.atomStrings.editorDOTautoIndent
import typings.atom.atomStrings.editorDOTautoIndentOnPaste
import typings.atom.atomStrings.editorDOTcommentEnd
import typings.atom.atomStrings.editorDOTcommentStart
import typings.atom.atomStrings.editorDOTconfirmCheckoutHeadRevision
import typings.atom.atomStrings.editorDOTdecreaseIndentPattern
import typings.atom.atomStrings.editorDOTfoldEndPattern
import typings.atom.atomStrings.editorDOTfontFamily
import typings.atom.atomStrings.editorDOTfontSize
import typings.atom.atomStrings.editorDOTincreaseIndentPattern
import typings.atom.atomStrings.editorDOTinvisibles
import typings.atom.atomStrings.editorDOTlineHeight
import typings.atom.atomStrings.editorDOTmaxScreenLineLength
import typings.atom.atomStrings.editorDOTnonWordCharacters
import typings.atom.atomStrings.editorDOTpreferredLineLength
import typings.atom.atomStrings.editorDOTscrollPastEnd
import typings.atom.atomStrings.editorDOTscrollSensitivity
import typings.atom.atomStrings.editorDOTshowCursorOnSelection
import typings.atom.atomStrings.editorDOTshowIndentGuide
import typings.atom.atomStrings.editorDOTshowInvisibles
import typings.atom.atomStrings.editorDOTshowLineNumbers
import typings.atom.atomStrings.editorDOTsoftTabs
import typings.atom.atomStrings.editorDOTsoftWrap
import typings.atom.atomStrings.editorDOTsoftWrapAtPreferredLineLength
import typings.atom.atomStrings.editorDOTsoftWrapHangingIndent
import typings.atom.atomStrings.editorDOTtabLength
import typings.atom.atomStrings.editorDOTtabType
import typings.atom.atomStrings.editorDOTundoGroupingInterval
import typings.atom.atomStrings.editorDOTzoomFontWhenCtrlScrolling
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.limited
import typings.atom.atomStrings.native
import typings.atom.atomStrings.no
import typings.atom.atomStrings.poll
import typings.atom.atomStrings.soft
import typings.atom.atomStrings.srgb
import typings.atom.atomStrings.undecided
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  @JSName("getAll")
  def getAll_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreaudioBeep(keyPath: coreDOTaudioBeep): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreaudioBeep(keyPath: coreDOTaudioBeep, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecolorProfile(keyPath: coreDOTcolorProfile): js.Array[Anon_DefaultScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corecolorProfile(keyPath: coreDOTcolorProfile, options: Anon_ExcludeSourcesScope): js.Array[Anon_DefaultScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corecustomFileTypes(keyPath: coreDOTcustomFileTypes): js.Array[Anon_KeyScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, options: Anon_ExcludeSourcesScope): js.Array[Anon_KeyScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coredisabledPackages(keyPath: coreDOTdisabledPackages): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coredisabledPackages(keyPath: coreDOTdisabledPackages, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corefileEncoding(keyPath: coreDOTfileEncoding): js.Array[Anon_ScopeDescriptorValueFileEncoding] = js.native
  @JSName("getAll")
  def getAll_corefileEncoding(keyPath: coreDOTfileEncoding, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueFileEncoding] = js.native
  @JSName("getAll")
  def getAll_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher): js.Array[Anon_AtomExperimental] = js.native
  @JSName("getAll")
  def getAll_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher, options: Anon_ExcludeSourcesScope): js.Array[Anon_AtomExperimental] = js.native
  @JSName("getAll")
  def getAll_corefollowSymlinks(keyPath: coreDOTfollowSymlinks): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  /**
    *  Get all of the values for the given key-path, along with their associated
    *  scope selector.
    */
  @JSName("getAll")
  def getAll_coreignoredNames(keyPath: coreDOTignoredNames): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreignoredNames(keyPath: coreDOTignoredNames, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart): js.Array[Anon_AlwaysNo] = js.native
  @JSName("getAll")
  def getAll_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart, options: Anon_ExcludeSourcesScope): js.Array[Anon_AlwaysNo] = js.native
  @JSName("getAll")
  def getAll_coretelemetryConsent(keyPath: coreDOTtelemetryConsent): js.Array[Anon_LimitedNo] = js.native
  @JSName("getAll")
  def getAll_coretelemetryConsent(keyPath: coreDOTtelemetryConsent, options: Anon_ExcludeSourcesScope): js.Array[Anon_LimitedNo] = js.native
  @JSName("getAll")
  def getAll_corethemes(keyPath: coreDOTthemes): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corethemes(keyPath: coreDOTthemes, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndent(keyPath: editorDOTautoIndent): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndent(keyPath: editorDOTautoIndent, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorcommentEnd(keyPath: editorDOTcommentEnd): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorcommentEnd(keyPath: editorDOTcommentEnd, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorcommentStart(keyPath: editorDOTcommentStart): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorcommentStart(keyPath: editorDOTcommentStart, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorfontFamily(keyPath: editorDOTfontFamily): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editorfontFamily(keyPath: editorDOTfontFamily, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editorfontSize(keyPath: editorDOTfontSize): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorfontSize(keyPath: editorDOTfontSize, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorinvisibles(keyPath: editorDOTinvisibles): js.Array[Anon_ScopeDescriptorValueInvisibles] = js.native
  @JSName("getAll")
  def getAll_editorinvisibles(keyPath: editorDOTinvisibles, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueInvisibles] = js.native
  @JSName("getAll")
  def getAll_editorlineHeight(keyPath: editorDOTlineHeight): js.Array[Anon_ScopeDescriptorValueNumberString] = js.native
  @JSName("getAll")
  def getAll_editorlineHeight(keyPath: editorDOTlineHeight, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumberString] = js.native
  @JSName("getAll")
  def getAll_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editornonWordCharacters(keyPath: editorDOTnonWordCharacters): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowInvisibles(keyPath: editorDOTshowInvisibles): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowInvisibles(keyPath: editorDOTshowInvisibles, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftTabs(keyPath: editorDOTsoftTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftTabs(keyPath: editorDOTsoftTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrap(keyPath: editorDOTsoftWrap): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrap(keyPath: editorDOTsoftWrap, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editortabLength(keyPath: editorDOTtabLength): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editortabLength(keyPath: editorDOTtabLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editortabType(keyPath: editorDOTtabType): js.Array[Anon_AutoHard] = js.native
  @JSName("getAll")
  def getAll_editortabType(keyPath: editorDOTtabType, options: Anon_ExcludeSourcesScope): js.Array[Anon_AutoHard] = js.native
  @JSName("getAll")
  def getAll_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  /**
    *  Retrieve the schema for a specific key path. The schema will tell you what type
    *  the keyPath expects, and other metadata about the config option.
    */
  def getSchema(keyPath: String): js.Object | Null = js.native
  /**
    *  Get an Array of all of the source Strings with which settings have been added
    *  via ::set.
    */
  def getSources(): js.Array[String] = js.native
  /** Get the string path to the config file being used. */
  def getUserConfigPath(): String = js.native
  @JSName("get")
  def get_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems): Boolean = js.native
  @JSName("get")
  def get_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreaudioBeep(keyPath: coreDOTaudioBeep): Boolean = js.native
  @JSName("get")
  def get_coreaudioBeep(keyPath: coreDOTaudioBeep, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate): Boolean = js.native
  @JSName("get")
  def get_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs): Boolean = js.native
  @JSName("get")
  def get_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows): Boolean = js.native
  @JSName("get")
  def get_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corecolorProfile(keyPath: coreDOTcolorProfile): default | srgb = js.native
  @JSName("get")
  def get_corecolorProfile(keyPath: coreDOTcolorProfile, options: Anon_ExcludeSources): default | srgb = js.native
  @JSName("get")
  def get_corecustomFileTypes(keyPath: coreDOTcustomFileTypes): StringDictionary[js.Array[String]] = js.native
  @JSName("get")
  def get_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, options: Anon_ExcludeSources): StringDictionary[js.Array[String]] = js.native
  @JSName("get")
  def get_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes): Boolean = js.native
  @JSName("get")
  def get_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coredisabledPackages(keyPath: coreDOTdisabledPackages): js.Array[String] = js.native
  @JSName("get")
  def get_coredisabledPackages(keyPath: coreDOTdisabledPackages, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths): Boolean = js.native
  @JSName("get")
  def get_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corefileEncoding(keyPath: coreDOTfileEncoding): FileEncoding = js.native
  @JSName("get")
  def get_corefileEncoding(keyPath: coreDOTfileEncoding, options: Anon_ExcludeSources): FileEncoding = js.native
  @JSName("get")
  def get_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher): native | experimental | poll | typings.atom.atomStrings.atom = js.native
  @JSName("get")
  def get_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher, options: Anon_ExcludeSources): native | experimental | poll | typings.atom.atomStrings.atom = js.native
  @JSName("get")
  def get_corefollowSymlinks(keyPath: coreDOTfollowSymlinks): Boolean = js.native
  @JSName("get")
  def get_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, options: Anon_ExcludeSources): Boolean = js.native
  // Managing Settings
  /** Retrieves the setting for the given key. */
  @JSName("get")
  def get_coreignoredNames(keyPath: coreDOTignoredNames): js.Array[String] = js.native
  @JSName("get")
  def get_coreignoredNames(keyPath: coreDOTignoredNames, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart): Boolean = js.native
  @JSName("get")
  def get_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount): Double = js.native
  @JSName("get")
  def get_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart): no | yes | always = js.native
  @JSName("get")
  def get_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart, options: Anon_ExcludeSources): no | yes | always = js.native
  @JSName("get")
  def get_coretelemetryConsent(keyPath: coreDOTtelemetryConsent): limited | no | undecided = js.native
  @JSName("get")
  def get_coretelemetryConsent(keyPath: coreDOTtelemetryConsent, options: Anon_ExcludeSources): limited | no | undecided = js.native
  @JSName("get")
  def get_corethemes(keyPath: coreDOTthemes): js.Array[String] = js.native
  @JSName("get")
  def get_corethemes(keyPath: coreDOTthemes, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm): Boolean = js.native
  @JSName("get")
  def get_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers): Boolean = js.native
  @JSName("get")
  def get_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages): js.Array[String] = js.native
  @JSName("get")
  def get_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit): Double = js.native
  @JSName("get")
  def get_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs): Boolean = js.native
  @JSName("get")
  def get_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorautoIndent(keyPath: editorDOTautoIndent): Boolean = js.native
  @JSName("get")
  def get_editorautoIndent(keyPath: editorDOTautoIndent, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste): Boolean = js.native
  @JSName("get")
  def get_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorcommentEnd(keyPath: editorDOTcommentEnd): String | Null = js.native
  @JSName("get")
  def get_editorcommentEnd(keyPath: editorDOTcommentEnd, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorcommentStart(keyPath: editorDOTcommentStart): String | Null = js.native
  @JSName("get")
  def get_editorcommentStart(keyPath: editorDOTcommentStart, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision): Boolean = js.native
  @JSName("get")
  def get_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern): String | Null = js.native
  @JSName("get")
  def get_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern): String | Null = js.native
  @JSName("get")
  def get_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorfontFamily(keyPath: editorDOTfontFamily): String = js.native
  @JSName("get")
  def get_editorfontFamily(keyPath: editorDOTfontFamily, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_editorfontSize(keyPath: editorDOTfontSize): Double = js.native
  @JSName("get")
  def get_editorfontSize(keyPath: editorDOTfontSize, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern): String | Null = js.native
  @JSName("get")
  def get_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorinvisibles(keyPath: editorDOTinvisibles): Invisibles = js.native
  @JSName("get")
  def get_editorinvisibles(keyPath: editorDOTinvisibles, options: Anon_ExcludeSources): Invisibles = js.native
  @JSName("get")
  def get_editorlineHeight(keyPath: editorDOTlineHeight): String | Double = js.native
  @JSName("get")
  def get_editorlineHeight(keyPath: editorDOTlineHeight, options: Anon_ExcludeSources): String | Double = js.native
  @JSName("get")
  def get_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength): Double = js.native
  @JSName("get")
  def get_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editornonWordCharacters(keyPath: editorDOTnonWordCharacters): String = js.native
  @JSName("get")
  def get_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength): Double = js.native
  @JSName("get")
  def get_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd): Boolean = js.native
  @JSName("get")
  def get_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity): Double = js.native
  @JSName("get")
  def get_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection): Boolean = js.native
  @JSName("get")
  def get_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide): Boolean = js.native
  @JSName("get")
  def get_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorshowInvisibles(keyPath: editorDOTshowInvisibles): Boolean = js.native
  @JSName("get")
  def get_editorshowInvisibles(keyPath: editorDOTshowInvisibles, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers): Boolean = js.native
  @JSName("get")
  def get_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftTabs(keyPath: editorDOTsoftTabs): Boolean = js.native
  @JSName("get")
  def get_editorsoftTabs(keyPath: editorDOTsoftTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrap(keyPath: editorDOTsoftWrap): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrap(keyPath: editorDOTsoftWrap, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent): Double = js.native
  @JSName("get")
  def get_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editortabLength(keyPath: editorDOTtabLength): Double = js.native
  @JSName("get")
  def get_editortabLength(keyPath: editorDOTtabLength, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editortabType(keyPath: editorDOTtabType): auto | soft | hard = js.native
  @JSName("get")
  def get_editortabType(keyPath: editorDOTtabType, options: Anon_ExcludeSources): auto | soft | hard = js.native
  @JSName("get")
  def get_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval): Double = js.native
  @JSName("get")
  def get_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling): Boolean = js.native
  @JSName("get")
  def get_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, options: Anon_ExcludeSources): Boolean = js.native
  def observe(keyPath: coreDOTcolorProfile, callback: js.Function1[/* value */ default | srgb, Unit]): Disposable = js.native
  def observe(
    keyPath: coreDOTcolorProfile,
    options: Anon_Scope,
    callback: js.Function1[/* value */ default | srgb, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTfileSystemWatcher,
    callback: js.Function1[/* value */ native | experimental | poll | typings.atom.atomStrings.atom, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTfileSystemWatcher,
    options: Anon_Scope,
    callback: js.Function1[/* value */ native | experimental | poll | typings.atom.atomStrings.atom, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    callback: js.Function1[/* value */ no | yes | always, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* value */ no | yes | always, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTtelemetryConsent,
    callback: js.Function1[/* value */ limited | no | undecided, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTtelemetryConsent,
    options: Anon_Scope,
    callback: js.Function1[/* value */ limited | no | undecided, Unit]
  ): Disposable = js.native
  def observe(keyPath: editorDOTtabType, callback: js.Function1[/* value */ auto | soft | hard, Unit]): Disposable = js.native
  def observe(
    keyPath: editorDOTtabType,
    options: Anon_Scope,
    callback: js.Function1[/* value */ auto | soft | hard, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreallowPendingPaneItems(
    keyPath: coreDOTallowPendingPaneItems,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreaudioBeep(keyPath: coreDOTaudioBeep, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreaudioBeep(keyPath: coreDOTaudioBeep, options: Anon_Scope, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreautomaticallyUpdate(
    keyPath: coreDOTautomaticallyUpdate,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corecloseDeletedFileTabs(
    keyPath: coreDOTcloseDeletedFileTabs,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corecloseEmptyWindows(
    keyPath: coreDOTcloseEmptyWindows,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    callback: js.Function1[/* value */ StringDictionary[js.Array[String]], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    options: Anon_Scope,
    callback: js.Function1[/* value */ StringDictionary[js.Array[String]], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coredestroyEmptyPanes(
    keyPath: coreDOTdestroyEmptyPanes,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coredisabledPackages(keyPath: coreDOTdisabledPackages, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coredisabledPackages(
    keyPath: coreDOTdisabledPackages,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreexcludeVcsIgnoredPaths(
    keyPath: coreDOTexcludeVcsIgnoredPaths,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corefileEncoding(keyPath: coreDOTfileEncoding, callback: js.Function1[/* value */ FileEncoding, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corefileEncoding(
    keyPath: coreDOTfileEncoding,
    options: Anon_Scope,
    callback: js.Function1[/* value */ FileEncoding, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corefollowSymlinks(
    keyPath: coreDOTfollowSymlinks,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  // Config Subscription
  /**
    *  Add a listener for changes to a given key path. This is different than ::onDidChange in
    *  that it will immediately call your callback with the current value of the config entry.
    */
  @JSName("observe")
  def observe_coreignoredNames(keyPath: coreDOTignoredNames, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. This is different than ::onDidChange in
    *  that it will immediately call your callback with the current value of the config entry.
    */
  @JSName("observe")
  def observe_coreignoredNames(
    keyPath: coreDOTignoredNames,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreopenEmptyEditorOnStart(
    keyPath: coreDOTopenEmptyEditorOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corereopenProjectMenuCount(
    keyPath: coreDOTreopenProjectMenuCount,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corethemes(keyPath: coreDOTthemes, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corethemes(
    keyPath: coreDOTthemes,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreuseProxySettingsWhenCallingApm(
    keyPath: coreDOTuseProxySettingsWhenCallingApm,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreuseTreeSitterParsers(
    keyPath: coreDOTuseTreeSitterParsers,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreversionPinnedPackages(
    keyPath: coreDOTversionPinnedPackages,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corewarnOnLargeFileLimit(
    keyPath: coreDOTwarnOnLargeFileLimit,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editoratomicSoftTabs(
    keyPath: editorDOTatomicSoftTabs,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndent(keyPath: editorDOTautoIndent, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndent(
    keyPath: editorDOTautoIndent,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndentOnPaste(
    keyPath: editorDOTautoIndentOnPaste,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentEnd(keyPath: editorDOTcommentEnd, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentEnd(
    keyPath: editorDOTcommentEnd,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentStart(keyPath: editorDOTcommentStart, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentStart(
    keyPath: editorDOTcommentStart,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorconfirmCheckoutHeadRevision(
    keyPath: editorDOTconfirmCheckoutHeadRevision,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editordecreaseIndentPattern(
    keyPath: editorDOTdecreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorfoldEndPattern(
    keyPath: editorDOTfoldEndPattern,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorfontFamily(keyPath: editorDOTfontFamily, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorfontFamily(
    keyPath: editorDOTfontFamily,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorfontSize(keyPath: editorDOTfontSize, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorfontSize(keyPath: editorDOTfontSize, options: Anon_Scope, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorincreaseIndentPattern(
    keyPath: editorDOTincreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorinvisibles(keyPath: editorDOTinvisibles, callback: js.Function1[/* value */ Invisibles, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorinvisibles(
    keyPath: editorDOTinvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Invisibles, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorlineHeight(keyPath: editorDOTlineHeight, callback: js.Function1[/* value */ String | Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorlineHeight(
    keyPath: editorDOTlineHeight,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editormaxScreenLineLength(
    keyPath: editorDOTmaxScreenLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editornonWordCharacters(
    keyPath: editorDOTnonWordCharacters,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorpreferredLineLength(
    keyPath: editorDOTpreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollPastEnd(
    keyPath: editorDOTscrollPastEnd,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollSensitivity(
    keyPath: editorDOTscrollSensitivity,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowCursorOnSelection(
    keyPath: editorDOTshowCursorOnSelection,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowIndentGuide(
    keyPath: editorDOTshowIndentGuide,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowInvisibles(keyPath: editorDOTshowInvisibles, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowInvisibles(
    keyPath: editorDOTshowInvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowLineNumbers(
    keyPath: editorDOTshowLineNumbers,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftTabs(keyPath: editorDOTsoftTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftTabs(keyPath: editorDOTsoftTabs, options: Anon_Scope, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrap(keyPath: editorDOTsoftWrap, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrap(keyPath: editorDOTsoftWrap, options: Anon_Scope, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapAtPreferredLineLength(
    keyPath: editorDOTsoftWrapAtPreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapHangingIndent(
    keyPath: editorDOTsoftWrapHangingIndent,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editortabLength(keyPath: editorDOTtabLength, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editortabLength(keyPath: editorDOTtabLength, options: Anon_Scope, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorundoGroupingInterval(
    keyPath: editorDOTundoGroupingInterval,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorzoomFontWhenCtrlScrolling(
    keyPath: editorDOTzoomFontWhenCtrlScrolling,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. If keyPath is not specified, your
    *  callback will be called on changes to any key.
    */
  // tslint:disable-next-line:no-any
  def onDidChange[T](callback: js.Function1[/* values */ Anon_NewValue[T], Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreallowPendingPaneItems(
    keyPath: coreDOTallowPendingPaneItems,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreallowPendingPaneItems(
    keyPath: coreDOTallowPendingPaneItems,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreaudioBeep(keyPath: coreDOTaudioBeep, callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreaudioBeep(
    keyPath: coreDOTaudioBeep,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreautomaticallyUpdate(
    keyPath: coreDOTautomaticallyUpdate,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreautomaticallyUpdate(
    keyPath: coreDOTautomaticallyUpdate,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseDeletedFileTabs(
    keyPath: coreDOTcloseDeletedFileTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseDeletedFileTabs(
    keyPath: coreDOTcloseDeletedFileTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseEmptyWindows(
    keyPath: coreDOTcloseEmptyWindows,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseEmptyWindows(
    keyPath: coreDOTcloseEmptyWindows,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecolorProfile(keyPath: coreDOTcolorProfile, callback: js.Function1[/* values */ Anon_Default, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecolorProfile(
    keyPath: coreDOTcolorProfile,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Default, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, callback: js.Function1[/* values */ Anon_Key, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Key, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredestroyEmptyPanes(
    keyPath: coreDOTdestroyEmptyPanes,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredestroyEmptyPanes(
    keyPath: coreDOTdestroyEmptyPanes,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredisabledPackages(keyPath: coreDOTdisabledPackages, callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredisabledPackages(
    keyPath: coreDOTdisabledPackages,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreexcludeVcsIgnoredPaths(
    keyPath: coreDOTexcludeVcsIgnoredPaths,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreexcludeVcsIgnoredPaths(
    keyPath: coreDOTexcludeVcsIgnoredPaths,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileEncoding(
    keyPath: coreDOTfileEncoding,
    callback: js.Function1[/* values */ Anon_NewValueOldValueFileEncoding, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileEncoding(
    keyPath: coreDOTfileEncoding,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueFileEncoding, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher, callback: js.Function1[/* values */ Anon_Atom, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileSystemWatcher(
    keyPath: coreDOTfileSystemWatcher,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Atom, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefollowSymlinks(
    keyPath: coreDOTfollowSymlinks,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefollowSymlinks(
    keyPath: coreDOTfollowSymlinks,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. If keyPath is not specified, your
    *  callback will be called on changes to any key.
    */
  @JSName("onDidChange")
  def onDidChange_coreignoredNames(keyPath: coreDOTignoredNames, callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. If keyPath is not specified, your
    *  callback will be called on changes to any key.
    */
  @JSName("onDidChange")
  def onDidChange_coreignoredNames(
    keyPath: coreDOTignoredNames,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreopenEmptyEditorOnStart(
    keyPath: coreDOTopenEmptyEditorOnStart,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreopenEmptyEditorOnStart(
    keyPath: coreDOTopenEmptyEditorOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corereopenProjectMenuCount(
    keyPath: coreDOTreopenProjectMenuCount,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corereopenProjectMenuCount(
    keyPath: coreDOTreopenProjectMenuCount,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corerestorePreviousWindowsOnStart(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    callback: js.Function1[/* values */ Anon_Always, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corerestorePreviousWindowsOnStart(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Always, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coretelemetryConsent(keyPath: coreDOTtelemetryConsent, callback: js.Function1[/* values */ Anon_Limited, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coretelemetryConsent(
    keyPath: coreDOTtelemetryConsent,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Limited, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corethemes(keyPath: coreDOTthemes, callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corethemes(
    keyPath: coreDOTthemes,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseProxySettingsWhenCallingApm(
    keyPath: coreDOTuseProxySettingsWhenCallingApm,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseProxySettingsWhenCallingApm(
    keyPath: coreDOTuseProxySettingsWhenCallingApm,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseTreeSitterParsers(
    keyPath: coreDOTuseTreeSitterParsers,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseTreeSitterParsers(
    keyPath: coreDOTuseTreeSitterParsers,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreversionPinnedPackages(
    keyPath: coreDOTversionPinnedPackages,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreversionPinnedPackages(
    keyPath: coreDOTversionPinnedPackages,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corewarnOnLargeFileLimit(
    keyPath: coreDOTwarnOnLargeFileLimit,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corewarnOnLargeFileLimit(
    keyPath: coreDOTwarnOnLargeFileLimit,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editoratomicSoftTabs(
    keyPath: editorDOTatomicSoftTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editoratomicSoftTabs(
    keyPath: editorDOTatomicSoftTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndent(
    keyPath: editorDOTautoIndent,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndent(
    keyPath: editorDOTautoIndent,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndentOnPaste(
    keyPath: editorDOTautoIndentOnPaste,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndentOnPaste(
    keyPath: editorDOTautoIndentOnPaste,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentEnd(keyPath: editorDOTcommentEnd, callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentEnd(
    keyPath: editorDOTcommentEnd,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentStart(
    keyPath: editorDOTcommentStart,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentStart(
    keyPath: editorDOTcommentStart,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorconfirmCheckoutHeadRevision(
    keyPath: editorDOTconfirmCheckoutHeadRevision,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorconfirmCheckoutHeadRevision(
    keyPath: editorDOTconfirmCheckoutHeadRevision,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editordecreaseIndentPattern(
    keyPath: editorDOTdecreaseIndentPattern,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editordecreaseIndentPattern(
    keyPath: editorDOTdecreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfoldEndPattern(
    keyPath: editorDOTfoldEndPattern,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfoldEndPattern(
    keyPath: editorDOTfoldEndPattern,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontFamily(
    keyPath: editorDOTfontFamily,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontFamily(
    keyPath: editorDOTfontFamily,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontSize(keyPath: editorDOTfontSize, callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontSize(
    keyPath: editorDOTfontSize,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorincreaseIndentPattern(
    keyPath: editorDOTincreaseIndentPattern,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorincreaseIndentPattern(
    keyPath: editorDOTincreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorinvisibles(
    keyPath: editorDOTinvisibles,
    callback: js.Function1[/* values */ Anon_NewValueOldValueInvisibles, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorinvisibles(
    keyPath: editorDOTinvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueInvisibles, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorlineHeight(
    keyPath: editorDOTlineHeight,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumberString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorlineHeight(
    keyPath: editorDOTlineHeight,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumberString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editormaxScreenLineLength(
    keyPath: editorDOTmaxScreenLineLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editormaxScreenLineLength(
    keyPath: editorDOTmaxScreenLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editornonWordCharacters(
    keyPath: editorDOTnonWordCharacters,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editornonWordCharacters(
    keyPath: editorDOTnonWordCharacters,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorpreferredLineLength(
    keyPath: editorDOTpreferredLineLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorpreferredLineLength(
    keyPath: editorDOTpreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollPastEnd(
    keyPath: editorDOTscrollPastEnd,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollPastEnd(
    keyPath: editorDOTscrollPastEnd,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollSensitivity(
    keyPath: editorDOTscrollSensitivity,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollSensitivity(
    keyPath: editorDOTscrollSensitivity,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowCursorOnSelection(
    keyPath: editorDOTshowCursorOnSelection,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowCursorOnSelection(
    keyPath: editorDOTshowCursorOnSelection,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowIndentGuide(
    keyPath: editorDOTshowIndentGuide,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowIndentGuide(
    keyPath: editorDOTshowIndentGuide,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowInvisibles(
    keyPath: editorDOTshowInvisibles,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowInvisibles(
    keyPath: editorDOTshowInvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowLineNumbers(
    keyPath: editorDOTshowLineNumbers,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowLineNumbers(
    keyPath: editorDOTshowLineNumbers,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftTabs(
    keyPath: editorDOTsoftTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftTabs(
    keyPath: editorDOTsoftTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrap(
    keyPath: editorDOTsoftWrap,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrap(
    keyPath: editorDOTsoftWrap,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapAtPreferredLineLength(
    keyPath: editorDOTsoftWrapAtPreferredLineLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapAtPreferredLineLength(
    keyPath: editorDOTsoftWrapAtPreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapHangingIndent(
    keyPath: editorDOTsoftWrapHangingIndent,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapHangingIndent(
    keyPath: editorDOTsoftWrapHangingIndent,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabLength(
    keyPath: editorDOTtabLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabLength(
    keyPath: editorDOTtabLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabType(keyPath: editorDOTtabType, callback: js.Function1[/* values */ Anon_Auto, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabType(
    keyPath: editorDOTtabType,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Auto, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorundoGroupingInterval(
    keyPath: editorDOTundoGroupingInterval,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorundoGroupingInterval(
    keyPath: editorDOTundoGroupingInterval,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorzoomFontWhenCtrlScrolling(
    keyPath: editorDOTzoomFontWhenCtrlScrolling,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorzoomFontWhenCtrlScrolling(
    keyPath: editorDOTzoomFontWhenCtrlScrolling,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  def set(keyPath: coreDOTcolorProfile, value: default): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: default, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: srgb): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: srgb, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: typings.atom.atomStrings.atom): Unit = js.native
  def set(
    keyPath: coreDOTfileSystemWatcher,
    value: typings.atom.atomStrings.atom,
    options: Anon_ScopeSelector
  ): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: experimental): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: experimental, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: native): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: native, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: poll): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: poll, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: always): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: always, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: no): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: no, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: yes): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: yes, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: limited): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: limited, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: no): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: no, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: undecided): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: undecided, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: editorDOTtabType, value: auto): Unit = js.native
  def set(keyPath: editorDOTtabType, value: auto, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: editorDOTtabType, value: hard): Unit = js.native
  def set(keyPath: editorDOTtabType, value: hard, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: editorDOTtabType, value: soft): Unit = js.native
  def set(keyPath: editorDOTtabType, value: soft, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreaudioBeep(keyPath: coreDOTaudioBeep, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreaudioBeep(keyPath: coreDOTaudioBeep, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, value: Boolean): Unit = js.native
  @JSName("set")
  def set_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, value: StringDictionary[js.Array[String]]): Unit = js.native
  @JSName("set")
  def set_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    value: StringDictionary[js.Array[String]],
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coredisabledPackages(keyPath: coreDOTdisabledPackages, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_coredisabledPackages(keyPath: coreDOTdisabledPackages, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corefileEncoding(keyPath: coreDOTfileEncoding, value: FileEncoding): Unit = js.native
  @JSName("set")
  def set_corefileEncoding(keyPath: coreDOTfileEncoding, value: FileEncoding, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, value: Boolean): Unit = js.native
  @JSName("set")
  def set_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  /**
    *  Sets the value for a configuration setting.
    *  This value is stored in Atom's internal configuration file.
    */
  @JSName("set")
  def set_coreignoredNames(keyPath: coreDOTignoredNames, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_coreignoredNames(keyPath: coreDOTignoredNames, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, value: Double): Unit = js.native
  @JSName("set")
  def set_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corethemes(keyPath: coreDOTthemes, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_corethemes(keyPath: coreDOTthemes, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, value: Double): Unit = js.native
  @JSName("set")
  def set_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorautoIndent(keyPath: editorDOTautoIndent, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorautoIndent(keyPath: editorDOTautoIndent, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd, value: String): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart, value: String): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, value: String): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, value: String): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfontFamily(keyPath: editorDOTfontFamily, value: String): Unit = js.native
  @JSName("set")
  def set_editorfontFamily(keyPath: editorDOTfontFamily, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfontSize(keyPath: editorDOTfontSize, value: Double): Unit = js.native
  @JSName("set")
  def set_editorfontSize(keyPath: editorDOTfontSize, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, value: String): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorinvisibles(keyPath: editorDOTinvisibles, value: Invisibles): Unit = js.native
  @JSName("set")
  def set_editorinvisibles(keyPath: editorDOTinvisibles, value: Invisibles, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: String): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, value: Double): Unit = js.native
  @JSName("set")
  def set_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, value: String): Unit = js.native
  @JSName("set")
  def set_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, value: Double): Unit = js.native
  @JSName("set")
  def set_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, value: Double): Unit = js.native
  @JSName("set")
  def set_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowInvisibles(keyPath: editorDOTshowInvisibles, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowInvisibles(keyPath: editorDOTshowInvisibles, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftTabs(keyPath: editorDOTsoftTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorsoftTabs(keyPath: editorDOTsoftTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftWrap(keyPath: editorDOTsoftWrap, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorsoftWrap(keyPath: editorDOTsoftWrap, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, value: Double): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editortabLength(keyPath: editorDOTtabLength, value: Double): Unit = js.native
  @JSName("set")
  def set_editortabLength(keyPath: editorDOTtabLength, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  /**
    *  Suppress calls to handler functions registered with ::onDidChange and ::observe
    *  for the duration of callback. After callback executes, handlers will be called
    *  once if the value for their key-path has changed.
    */
  def transact(callback: js.Function0[Unit]): Unit = js.native
  /** Restore the setting at keyPath to its default value. */
  def unset(keyPath: String): Unit = js.native
  def unset(keyPath: String, options: Anon_ScopeSelector): Unit = js.native
}

